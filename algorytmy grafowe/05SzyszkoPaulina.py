from copy import deepcopy

def read_input(file_name):
    f = open(file_name)
    matrix = []
    list_of_edges_to_change = []
    for line in f:
        if len(line) > 5:
            matrix += [line.split()]
            for list_in_matrix in matrix:
                for i in range(len(list_in_matrix)):
                    if list_in_matrix[i] == '-':
                        list_in_matrix[i] = float('inf')
                    else:
                        if list_in_matrix[i] != float('inf'):
                            list_in_matrix[i] = int(list_in_matrix[i])
        else:
            list_of_edges_to_change += [line.split()]
            for i in range(len(list_of_edges_to_change)):
                for j in range(len(list_of_edges_to_change[i])):
                    list_of_edges_to_change[i][j] = int(list_of_edges_to_change[i][j])

    f.close()
    return matrix, list_of_edges_to_change

def create_adjacency_list_from_adjacency_matrix(matrix):
    adjacency_list = {}
    counter = 7
    for row in matrix:
        counter_for_element = 1
        adjacency_list_of_element = []
        for element in row:
            if element == 1:
                adjacency_list_of_element += [counter_for_element]
            counter_for_element += 1
        adjacency_list[counter] = adjacency_list_of_element
        counter += 1
    return adjacency_list

def create_adjacency_list_from_adjacency_matrix_x(matrix):
    adjacency_list = {}
    counter = 1
    for row in matrix:
        counter_for_element = 1
        adjacency_list_of_element = []
        for element in row:
            if element == 1:
                adjacency_list_of_element += [counter_for_element + 6]
            counter_for_element += 1
        adjacency_list[counter] = adjacency_list_of_element
        counter += 1
    return adjacency_list

def create_list_of_edges_from_adjacency_list(adjacency_list):
    adjacency_list_copy = deepcopy(adjacency_list)
    list_of_edges = []
    for node in adjacency_list_copy.keys():
        for neighbour in adjacency_list_copy[node]:
            list_of_edges.append((node, neighbour))
    return list_of_edges

def print_adjacency_list(adjacency_list):
    print("Lista następników: ")
    for i in adjacency_list:
        element = str(i) + ': '
        for j in adjacency_list[i]:
            element += str(j) + ' '
        print(element)

def expand_matching(matching, node_to_be_added, last_node_in_tree, dict_of_nodes):
    #print("\n" + str(node_to_be_added) + "\n")
    matching_copy = deepcopy(matching)
    dict_of_nodes_copy = deepcopy(dict_of_nodes)
    edge_to_be_added = ()
    if dict_of_nodes_copy[last_node_in_tree] == None and dict_of_nodes_copy[node_to_be_added] == None:
        edge_to_be_added = (node_to_be_added, last_node_in_tree)
        matching_copy[2][node_to_be_added] = last_node_in_tree
        matching_copy[3][last_node_in_tree] = node_to_be_added
        matching_copy[4].append((node_to_be_added, last_node_in_tree))
    else:
        current_node = last_node_in_tree
        while dict_of_nodes_copy[current_node] != node_to_be_added:
            #print("\n" + "printing matching" + "\n" + str(matching_copy) + "\n" + str(dict_of_nodes_copy) + "\n")

            pred_c = dict_of_nodes_copy[current_node]
            pred_pred_c = dict_of_nodes_copy[pred_c]
            matching_copy[4].append((pred_c, current_node))
            matching_copy[4].remove((pred_c, pred_pred_c))
            matching_copy[3][current_node] = pred_c
            matching_copy[2][pred_c] = current_node
            current_node = pred_pred_c
        matching_copy[3][current_node] = node_to_be_added
        matching_copy[2][node_to_be_added] = current_node
        matching_copy[4].append((node_to_be_added, current_node))
        matching_copy[0].append(node_to_be_added)
        matching_copy[1].append(last_node_in_tree)
    return matching_copy

def print_current_matching(matching):
    m = matching[4]
    for i in range(len(m)):
        m[i] = (m[i][0], m[i][1] - 6)
    m_sorted = sorted(m)
    string = ""
    for s in m_sorted:
        string += str(s) + " "
    print("Aktualne skojarzenie: " + string)
    #print("Aktualne skojarzenie: " + str(m))

if __name__ == '__main__':
    matrix, list_of_edges_to_change = read_input(
        "graph11.txt")

    adjacency_list = create_adjacency_list_from_adjacency_matrix(matrix)
    #print_adjacency_list(adjacency_list)

    matrix_x = [[matrix[j][i] for j in range(len(matrix))] for i in range(len(matrix[0]))]
    adjacency_list_x = create_adjacency_list_from_adjacency_matrix_x(matrix_x)
    #print_adjacency_list(adjacency_list_x)

    adjacency_list_final = {**adjacency_list_x, **adjacency_list}
    #print_adjacency_list(adjacency_list_final)

    list_of_edges = create_list_of_edges_from_adjacency_list(adjacency_list_final)
    #print(list_of_edges)

    list_of_nodes_x = list(adjacency_list_x.keys())
    #print(list_of_nodes_x)

    dict_x_to_y = {}
    for i in range(1, 7):
        dict_x_to_y[i] = None

    dict_y_to_x = {}
    for i in range(7, 13):
        dict_y_to_x[i] = None

    matching_m = ([], [], dict_x_to_y, dict_y_to_x, [])
    is_matching_saturating = True

    nodes_left_in_x = list(adjacency_list_x.keys())

    # dict_of_nodes = {}
    # for node in adjacency_list_final.keys():
    #     dict_of_nodes[node] = None

    while (matching_m[0] != list_of_nodes_x and is_matching_saturating):

        dict_of_nodes = {}
        for node in adjacency_list_final.keys():
            dict_of_nodes[node] = None

        current_node = nodes_left_in_x.pop(0)
        # print(current_node)
        queue_s = [current_node]
        found_from_y = []

        expand = False
        index = 0
        while (is_matching_saturating and not (expand)):
            current_resolved = queue_s[index]
            resolved_neighbours = adjacency_list_final[current_resolved]
            resolved_neighbours_without_those_already_added = [x for x in resolved_neighbours if x not in found_from_y]
            # found_from_y = T
            found_from_y += resolved_neighbours_without_those_already_added
            for node in resolved_neighbours_without_those_already_added:
                # wierzchołki wskazują na swoich poprzedników
                dict_of_nodes[node] = current_resolved
                nodes_connected_to_node = [x[0] for x in list(filter(lambda x: x[1] == node, matching_m[4]))]
                for node_connected in nodes_connected_to_node:
                    dict_of_nodes[node_connected] = node
                if (node not in matching_m[1]):
                    #print("powiększ")
                    matching_m = expand_matching(matching_m, current_node, node, dict_of_nodes)
                    expand = True
                    index = -1
                    #print("Aktualne skojarzenie: " + str(matching_m[4]))
                    print_current_matching(deepcopy(matching_m))
                    break
                else:
                    nodes_v = list(filter(lambda x: x[1] == node, matching_m[4]))
                    #print("nodes filtered: " + str(nodes_v))
                    if not(nodes_v[0][0] in queue_s):
                        queue_s.append(nodes_v[0][0])
                    #print("que " + str(queue_s))

            #print("matching: " + str(matching_m))
            index += 1
            if len(queue_s) <= index:
                is_matching_saturating = False

    if  matching_m[0] == list_of_nodes_x and is_matching_saturating:
        print("Udało się  znaleźć skojarzenie nasycajace zbiór X:")
        #print(matching_m[2])
        print_current_matching(deepcopy(matching_m))
    else :
        print("Nie ma skojarzenia w grafie. Dla S = " + str(tuple(sorted(queue_s))) + " mamy |N(S)| < |S|")
        #print("S: " + str(sorted(queue_s)))
        #print("T: " + str(found_from_y))
        #print("Matching is not saturating")

                    # filter(lambda x: x % 2 == 0, lst)


        # is_matching_saturating = False





















