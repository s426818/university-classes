def read_input(file_name):
    f = open(file_name)
    matrix = []
    for line in f:
        matrix += [line.split()]
        for list_in_matrix in matrix:
            for i in range(len(list_in_matrix)):
                if list_in_matrix[i] == '-':
                    list_in_matrix[i] = 0
                else:
                    list_in_matrix[i] = int(list_in_matrix[i])
    f.close()
    return matrix

def create_adjacency_list(matrix):
    adjacency_list = {}
    counter = 1
    for row in matrix:
        counter_for_element = 1
        adjacency_list_of_element = []
        for element in row:
            if element != 0:
                adjacency_list_of_element += [counter_for_element]
            counter_for_element += 1
        adjacency_list[counter] = adjacency_list_of_element
        counter += 1
    return adjacency_list

def consistencyBFS(start, end, adjacency_list):
    temp_list = [start]
    k = 0
    while(k < len(temp_list)):
        temp = temp_list[k]
        for elem in adjacency_list[temp]:
            if elem == end:
                return True
            if not(temp_list.__contains__(elem)):
                temp_list.append(elem)
        k += 1
    return False

if __name__ == '__main__':
    matrix = read_input("C:\\Users\\Paulina\\PycharmProjects\\SieciNeuronoweGrafy\\algorytmy-grafowe\\graph03.txt")

    list_of_edges = []

    for i in range(len(matrix)):
        for j in range(i, len(matrix)):
            if matrix[i][j] == 1:
                edge = [i+1, j+1]
                list_of_edges.append(edge)

    adjacency_list = create_adjacency_list(matrix)
    print(adjacency_list)

    for elem in list_of_edges:
        adjacency_list[elem[0]].remove(elem[1])
        adjacency_list[elem[1]].remove(elem[0])
        if consistencyBFS(elem[0], elem[1], adjacency_list):
            print("(" + str(elem[0]) + ", " + str(elem[1]) +  ")" + " NIE")
        else:
            print("(" + str(elem[0]) + ", " + str(elem[1]) + ")" + " TAK")
        adjacency_list[elem[0]].append(elem[1])
        adjacency_list[elem[1]].append(elem[0])


