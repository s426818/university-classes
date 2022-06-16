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


def create_graph(matrix):
    graph = {}
    counter = 1
    for row in matrix:
        counter_for_element = 1
        dict_for_element = {}
        for element in row:
            if element != float('inf'):
                dict_for_element[counter_for_element] = element
            counter_for_element += 1
        graph[counter] = dict_for_element
        counter += 1
    return graph


def list_of_edges(matrix):
    edges = {}
    counter = 1
    for row in matrix:
        counter_for_element = 1
        for element in row:
            if element != float('inf'):
                pair = (counter, counter_for_element)
                edges[pair] = element
            counter_for_element += 1
        counter += 1
    return edges


def modify_lists(list_of_edges_to_change, adjacency_list, graph, list_of_edges):
    for edge in list_of_edges_to_change:
        pair = (edge[0], edge[1])
        pair_reversed = (edge[1], edge[0])
        if (list_of_edges.get(pair) == None):
            list_of_edges[pair] = 3
            adjacency_list[edge[0]].append(edge[1])
            adjacency_list[edge[1]].append(edge[0])
            graph[edge[0]][edge[1]] = 3
        else:
            list_of_edges.pop(pair)
            list_of_edges.pop(pair_reversed)
            adjacency_list[edge[0]].remove(edge[1])
            adjacency_list[edge[1]].remove(edge[0])
            graph[edge[0]].pop(edge[1])
            graph[edge[1]].pop(edge[0])

    return adjacency_list, graph, list_of_edges

def initializeWeights(graph):
    dict_of_nodes = dict()
    list_of_nodes = []
    for key in graph.keys():
        if(key == 1):
            dict_of_nodes[key] = (0, None)
        else:
            dict_of_nodes[key] = (float('inf'), None)
            list_of_nodes.append(key)
    return  dict_of_nodes, list_of_nodes

def findNodeWithLowestWeights(list_of_nodes, dict_of_nodes):
    node_number = list_of_nodes[0]
    weight = dict_of_nodes[node_number][0]
    for key in list_of_nodes:
        if dict_of_nodes[key][0] < weight:
            node_number = key
    return node_number

def relaxation(node_number_start, node_number_end, dict_of_nodes,  list_of_edges):
    dict_of_nodes_copy = deepcopy(dict_of_nodes)
    current_weights_end_node = dict_of_nodes_copy[node_number_end][0]
    current_edge_weight = list_of_edges[(node_number_start, node_number_end)]
    if dict_of_nodes_copy[node_number_start][0] + current_edge_weight < current_weights_end_node:
        dict_of_nodes_copy[node_number_end] = (dict_of_nodes_copy[node_number_start][0] + current_edge_weight, node_number_start)
    return  dict_of_nodes_copy

def path(node, dict_of_nodes):
    dict_of_nodes_copy = deepcopy(dict_of_nodes)
    path_list = []
    node_to_add = node
    while node_to_add != None:
        path_list.insert(0, node_to_add)
        node_to_add = dict_of_nodes_copy[node_to_add][1]
    return path_list

def dijkstra(node_number_start, node_number_end, list_of_nodes, dict_of_nodes, adjacency_list, list_of_edges):
    dict_of_nodes_copy = deepcopy(dict_of_nodes)
    list_of_nodes_copy = deepcopy(list_of_nodes)
    adjacency_list_copy = deepcopy(adjacency_list)
    list_of_edges_copy = deepcopy(list_of_edges)
    # z w algorytmie
    current_node = node_number_start
    while current_node != node_number_end:
        for node in adjacency_list_copy[current_node]:
            dict_of_nodes_copy = relaxation(current_node, node, dict_of_nodes_copy, list_of_edges_copy)
        current_node = findNodeWithLowestWeights(list_of_nodes_copy, dict_of_nodes_copy)
        list_of_nodes_copy.remove(current_node)
    path_list = path(node_number_end, dict_of_nodes_copy)
    return dict_of_nodes_copy[current_node][0], path_list

def bellman_ford(dict_of_nodes, adjacency_list, list_of_edges):
    dict_of_nodes_copy = deepcopy(dict_of_nodes)
    adjacency_list_copy = deepcopy(adjacency_list)
    list_of_edges_copy = deepcopy(list_of_edges)

    print(dict_of_nodes_copy)
    print(list_of_edges_copy)
    print(len(list_of_edges_copy))
    # z w algorytmie
    for i in range(len(dict_of_nodes_copy) - 1 ):
        for node in dict_of_nodes_copy.keys():
            for neighbor in adjacency_list_copy[node]:
                dict_of_nodes_copy = relaxation(node, neighbor, dict_of_nodes_copy,list_of_edges_copy)
        print(dict_of_nodes_copy)
    copy_of_dict = deepcopy(dict_of_nodes_copy)
    for node in copy_of_dict.keys():
        for neighbor in adjacency_list_copy[node]:
            copy_of_dict = relaxation(node, neighbor, copy_of_dict, list_of_edges_copy)
    if(copy_of_dict == dict_of_nodes_copy):
        return dict_of_nodes_copy, True
    else: return "Jest ujemny cykl, nie ma rozwiązania.", False

def print_path_with_weight(node_number, weight, path_list):
    path_str = ""
    for element in path_list:
        path_str += str(element) + " "
    print(str(node_number) + ": " + path_str + "ma długość " + str(weight))


if __name__ == '__main__':
    matrix, list_of_edges_to_change = read_input(
        "C:\\Users\\Paulina\\PycharmProjects\\SieciNeuronoweGrafy\\algorytmy-grafowe\\MatrixPaths01.txt")

    adjacency_list = create_adjacency_list(matrix)

    graph = create_graph(matrix)

    list_of_edges = list_of_edges(matrix)

    dict_of_nodes, list_of_nodes  = initializeWeights(graph)

    test = True
    for row in matrix:
        for element in row:
            if element < 0:
                test = False

    if(test):
        print("Wagi są dodatnie, korzystam z algorytmu Dijkstry.")
        for node in graph.keys():
            d, path_list = dijkstra(1, node, list_of_nodes, dict_of_nodes, adjacency_list, list_of_edges)
            print_path_with_weight(node, d, path_list)
    else:
        print("Są wagi ujemne, korzystam z algorytmu Bellmana-Forda.")
        bf, test = bellman_ford(dict_of_nodes, adjacency_list, list_of_edges)
        if test:
            for node in bf:
                path_list = path(node, bf)
                print_path_with_weight(node, bf[node][0], path_list)
        else:
            print(bf)












