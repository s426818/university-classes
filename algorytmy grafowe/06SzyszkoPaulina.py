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

def create_adjacency_list(matrix):
    adjacency_list = {}
    counter = 1
    for row in matrix:
        counter_for_element = 1
        adjacency_list_of_element = []
        for element in row:
            if element != float('inf'):
                adjacency_list_of_element += [counter_for_element]
            counter_for_element += 1
        adjacency_list[counter] = adjacency_list_of_element
        counter += 1
    return adjacency_list

def print_adjacency_list(adjacency_list):
    print("Lista następników: ")
    for i in adjacency_list:
        element = str(i) + ': '
        for j in adjacency_list[i]:
            element += str(j) + ' '
        print(element)

def print_flow(list_of_edges):
    print("Wartość przepływu w przepływie maksymalnym na kolejnych krawędziach: ")
    for i in list_of_edges:
        element = str(i) + ': ' + str(list_of_edges[i][1])
        print(element)

def find_max_flow(list_of_edges, dict_of_nodes):
    list_of_edges_copy = deepcopy(list_of_edges)
    dict_of_nodes_copy = deepcopy(dict_of_nodes)
    last_node = find_max_node(dict_of_nodes_copy)
    nodes_v = list(filter(lambda x: x[1] == last_node, list_of_edges_copy.keys()))
    max_flow = 0
    for edge in nodes_v:
        max_flow += list_of_edges_copy[edge][1]
    print("Wartość przepływu maksymalnego: " + str(max_flow))

def list_of_edges(matrix):
    edges = {}
    counter = 1
    for row in matrix:
        counter_for_element = 1
        for element in row:
            if element != float('inf'):
                pair = (counter, counter_for_element)
                edges[pair] = (element, 0)
            counter_for_element += 1
        counter += 1
    return edges

def create_complete_adjacency_list(list_of_edges, adjacency_list):
    adjacency_list_copy = deepcopy(adjacency_list)
    list_of_edges_copy = deepcopy(list_of_edges)
    complete_adjacency_list = {}
    for node in adjacency_list_copy.keys():
        neighbours = []
        nodes_v = list(filter(lambda x: x[1] == node, list_of_edges_copy.keys()))
        for tuple in nodes_v:
            neighbours.append(tuple[0])
        nodes_v = list(filter(lambda x: x[0] == node, list_of_edges_copy.keys()))
        for tuple in nodes_v:
            neighbours.append(tuple[1])
        complete_adjacency_list[node] = sorted(deepcopy(neighbours))
    return complete_adjacency_list

def create_dict_of_nodes(adjacency_list):
    adjacency_list_copy = deepcopy(adjacency_list)
    dict_of_nodes = {}
    for node in adjacency_list_copy.keys():
        if node == 1:
            dict_of_nodes[node] = (None, None, float('inf'))
        else:
            dict_of_nodes[node] = ()
    return dict_of_nodes

def mark_node(dict_of_nodes, list_of_edges, resolved_node, parent_node):
    dict_of_nodes_copy = deepcopy(dict_of_nodes)
    list_of_edges_copy = deepcopy(list_of_edges)
    inconsistent_edge = (resolved_node, parent_node)
    consistent_edge = (parent_node, resolved_node)
    sign = ""
    flow = ()
    if inconsistent_edge in list_of_edges_copy.keys():
        sign = "-"
        flow = list_of_edges_copy[inconsistent_edge]
    if consistent_edge in list_of_edges_copy.keys():
        sign = "+"
        flow = list_of_edges_copy[consistent_edge]
    flow_difference = flow[0] - flow[1]
    dict_of_nodes_copy[resolved_node] = (parent_node, sign, flow_difference)
    return dict_of_nodes_copy

def find_max_node(dict_of_nodes):
    max = -1
    for node in dict_of_nodes.keys():
        if node > max:
            max = node
    return max

def find_path(dict_of_nodes):
    dict_of_nodes_copy = deepcopy(dict_of_nodes)
    path = []
    current_node = find_max_node(dict_of_nodes_copy)
    while current_node != 1:
        path.append(current_node)
        current_node = dict_of_nodes_copy[current_node][0]
    path.append(current_node)
    path = list(reversed(path))
    return path

def find_min_on_path(dict_of_nodes):
    dict_of_nodes_copy = deepcopy(dict_of_nodes)
    path = find_path(dict_of_nodes_copy)
    min = float('inf')
    for node in path:
        value = dict_of_nodes_copy[node][2]
        if value < min:
            min = value
    return min

def modify_flow(list_of_edges, dict_of_nodes):
    list_of_edges_copy = deepcopy(list_of_edges)
    dict_of_nodes_copy = deepcopy(dict_of_nodes)
    path = find_path(dict_of_nodes_copy)
    min = find_min_on_path(dict_of_nodes_copy)
    for i in range(1, len(path)):
        sign = dict_of_nodes_copy[path[i]][1]
        edge_prim, sign_prim = find_edge_and_sign(list_of_edges_copy, path[i-1], path[i])
        max_flow_value = list_of_edges_copy[edge_prim][0]
        flow_value = list_of_edges_copy[edge_prim][1]
        if sign == "+":
            list_of_edges_copy[edge_prim] = (max_flow_value, flow_value + min)
        else:
            list_of_edges_copy[edge_prim] = (max_flow_value, flow_value - min)
    return list_of_edges_copy

def find_edge_and_sign(list_of_edges, current_node, neighbour):
    list_of_edges_copy = deepcopy(list_of_edges)
    edge = ()
    sign = ""
    consistent_edge = (current_node, neighbour)
    inconsistent_edge = (neighbour, current_node)
    if consistent_edge in list_of_edges_copy.keys():
        edge = consistent_edge
        sign = "+"
    if inconsistent_edge in list_of_edges_copy.keys():
        edge = inconsistent_edge
        sign = "-"
    return edge, sign

def find_condition(list_of_edges, current_node, neighbour):
    list_of_edges_copy = deepcopy(list_of_edges)
    edge, sign = find_edge_and_sign(list_of_edges_copy, current_node, neighbour)
    max_flow_value = list_of_edges_copy[edge][0]
    flow_value = list_of_edges_copy[edge][1]
    if sign == "+":
        if flow_value == max_flow_value:
            return False
        else:
            return True
    else:
        if flow_value == 0:
            return False
        else:
            return  True

if __name__ == '__main__':
    matrix, list_of_edges_to_change = read_input(
        "graph13.txt")

    adjacency_list = create_adjacency_list(matrix)

    max_flow_value = 0

    list_of_edges = list_of_edges(matrix)

    dict_of_nodes = create_dict_of_nodes(adjacency_list)

    marked_nodes = [1]
    resolved_nodes = []
    index = 0

    last_node = find_max_node(dict_of_nodes)

    complete_adjacency_list = create_complete_adjacency_list(list_of_edges, adjacency_list)

    while (marked_nodes != resolved_nodes and 8 not in marked_nodes):
        current_node = marked_nodes[index]
        resolved_nodes.append(current_node)
        index += 1
        for neighbour in complete_adjacency_list[current_node]:
            condition = find_condition(list_of_edges, current_node, neighbour)
            if dict_of_nodes[neighbour] == () and condition:
                dict_of_nodes = mark_node(dict_of_nodes, list_of_edges, neighbour, current_node)
                marked_nodes.append(neighbour)

        if(last_node in marked_nodes):
            path = find_path(dict_of_nodes)
            min = find_min_on_path(dict_of_nodes)
            print("Ścieżka powiększająca: " + str(path) + ". Dodajemy wartość: " + str(min))
            list_of_edges = modify_flow(list_of_edges, dict_of_nodes)
            dict_of_nodes = create_dict_of_nodes(adjacency_list)
            marked_nodes = [1]
            resolved_nodes = []
            index = 0

    print("Cięcie minimalne: " + str(marked_nodes))
    print_flow(list_of_edges)
    find_max_flow(list_of_edges, dict_of_nodes)



