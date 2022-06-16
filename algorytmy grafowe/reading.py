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


# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    matrix, list_of_edges_to_change = read_input(
        "C:\\Users\\Paulina\\PycharmProjects\\SieciNeuronoweGrafy\\algorytmy-grafowe\\graph.txt")

    adjacency_list = create_adjacency_list(matrix)
    print("Lista następników (słownik): ")
    print(adjacency_list)

    graph = create_graph(matrix)
    print("Graf z wagami (słownik słowników):")
    print(graph)

    list_of_edges = list_of_edges(matrix)
    print("Lista krawędzi z wagami (słownik): ")
    print(list_of_edges)

    print_adjacency_list(adjacency_list)

    new_adjacency_list, new_graph, new_list_of_edges = modify_lists(list_of_edges_to_change, adjacency_list, graph,
                                                                    list_of_edges)

    print("Po modyfikacji krawędzi: ")
    print("Lista następników (słownik): ")
    print(new_adjacency_list)
    print("Graf z wagami (słownik słowników):")
    print(new_graph)
    print("Lista krawędzi z wagami (słownik): ")
    print(new_list_of_edges)
    print_adjacency_list(new_adjacency_list)

# See PyCharm help at https://www.jetbrains.com/help/pycharm/
