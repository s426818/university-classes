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
    counter = 1
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

def print_adjacency_list(adjacency_list):
    print("Lista następników: ")
    for i in adjacency_list:
        element = str(i) + ': '
        for j in adjacency_list[i]:
            element += str(j) + ' '
        print(element)

def create_list_of_edges_from_adjacency_list(adjacency_list):
    list_of_edges = []
    for element in adjacency_list[1]:
        list_of_edges.append((1, element))
    for i in range(2, 8):
        for j in adjacency_list[i]:
            if not((j, i) in list_of_edges):
                list_of_edges.append((i, j))
    return list_of_edges

def create_starting_dict_of_nodes():
    dict_of_nodes = {}
    for i in range(7):
        dict_of_nodes[i+1] = (i+1, None)
    return dict_of_nodes

def new_root(node_to_be_new_root, dict_of_nodes):
    new_dict_of_nodes = deepcopy(dict_of_nodes)
    x_old = dict_of_nodes[node_to_be_new_root][0]
    if x_old == node_to_be_new_root:
        return new_dict_of_nodes
    old_root = dict_of_nodes[node_to_be_new_root][0]
    u_minus = None
    u_plus = node_to_be_new_root
    while u_minus  != x_old:
        p = u_minus
        u_minus = u_plus
        u_plus = dict_of_nodes[u_minus][1]
        dict_of_nodes[u_minus] = (dict_of_nodes[u_minus][0], p)
    for node in dict_of_nodes:
        if dict_of_nodes[node][0] == old_root:
            dict_of_nodes[node] = (node_to_be_new_root, dict_of_nodes[node][1])
    return  new_dict_of_nodes

def add_edge(edge_to_be_added, dict_of_nodes):
    new_dict_of_nodes = deepcopy(dict_of_nodes)
    '''
     new_dict_of_nodes = new_root(edge_to_be_added[1], new_dict_of_nodes)
    new_dict_of_nodes[edge_to_be_added[1]] = (edge_to_be_added[0], new_dict_of_nodes[edge_to_be_added[1]][1])
    x1 = new_dict_of_nodes[edge_to_be_added[1]][1]
    x2 = new_dict_of_nodes[edge_to_be_added[0]][1]
    for w in range(7):
        if new_dict_of_nodes[w+1][1] == x1:
            new_dict_of_nodes[w + 1] = (new_dict_of_nodes[w + 1][0], x2)
    '''
    (u, v) = edge_to_be_added
    new_dict_of_nodes[v] = (new_dict_of_nodes[v][0], u)
    x1 = new_dict_of_nodes[v][0]
    x2 = new_dict_of_nodes[u][0]
    for w in range(7):
        if new_dict_of_nodes[w + 1][0] == x1:
            new_dict_of_nodes[w + 1] = (x2, new_dict_of_nodes[w+1][1])
    return new_dict_of_nodes

def is_connected_to_new_to_be_root(node, new_to_be_root, dict_of_nodes):
    new_dict_of_nodes = deepcopy(dict_of_nodes)
    p = new_dict_of_nodes[node][1]
    while p != new_to_be_root and p != None:
        p = new_dict_of_nodes[p][1]
    if p == new_to_be_root:
        return True
    return False

def find_all_conected_to_new_to_be_root(new_to_be_root, dict_of_nodes):
    new_dict_of_nodes = deepcopy(dict_of_nodes)
    subtree = [new_to_be_root]
    for  node in range(7):
        if is_connected_to_new_to_be_root(node + 1, new_to_be_root, new_dict_of_nodes):
            subtree.append(node + 1)
    return  subtree

def delete_edge(edge_to_be_deleted, dict_of_nodes):
    new_dict_of_nodes = deepcopy(dict_of_nodes)
    (u, v) = edge_to_be_deleted
    if new_dict_of_nodes[u][1] == v:
        v1 = v
        v2 = u
    else:
        v1 = u
        v2 = v
    new_dict_of_nodes[v2] = (v2, None)
    subtree = find_all_conected_to_new_to_be_root(v2, new_dict_of_nodes)
    for node in subtree:
        new_dict_of_nodes[node] = (v2, new_dict_of_nodes[node][1])
    return new_dict_of_nodes

def create_all_trees(node, list_of_edges, dict_of_nodes, adjacency_list):
    list_of_edges_copy = deepcopy(list_of_edges)
    dict_of_nodes_copy = deepcopy(dict_of_nodes)
    adjacency_list_copy = deepcopy(adjacency_list)
    trees = []
    k = 0
    i = 0
    tree = []
    tree.append(None)
    while( tree[0] == None or tree[0] < len(adjacency_list_copy[node]) or tree[0] == None):
        (uk, vk) = list_of_edges_copy[k]
        if dict_of_nodes_copy[uk][0] != dict_of_nodes_copy[vk][0]:
            dict_of_nodes_copy = add_edge(list_of_edges_copy[k], dict_of_nodes_copy)
            #print(dict_of_nodes_copy)
            if tree[0] == None:
                tree.pop()
            tree.append(k)
            print(tree)
            i += 1
        if (tree[0] == None and k >= len(adjacency_list_copy[node])) or tree[0] >=  len(adjacency_list_copy[node]) :
            break
        if i == len(dict_of_nodes_copy.keys()) - 1:
            trees.append(tree.copy())
            print(trees)
        if i == len(dict_of_nodes_copy.keys()) - 1 or k == len(list_of_edges_copy) - 1:
            #print(i)
            #print(k)
            '''
            if tree[i - 1] == len(list_of_edges_copy) - 1:
                dict_of_nodes_copy = delete_edge(list_of_edges_copy[len(list_of_edges_copy) - 1], dict_of_nodes_copy)
                print(dict_of_nodes_copy)
                tree.pop()
                i -= 1
                if len(tree) == 0:
                    tree.append(None)
            '''
            dict_of_nodes_copy = delete_edge(list_of_edges_copy[tree[i - 1]], dict_of_nodes_copy)
            #print(dict_of_nodes_copy)

            k = (tree[i - 1] + 1) #% len(list_of_edges)
            tree.pop()
            i -= 1
        else:
            k += 1
        if len(tree) == 0:
            tree.append(None)
    return trees

if __name__ == '__main__':
    matrix, list_of_edges_to_change = read_input(
        "C:\\Users\\Paulina\\PycharmProjects\\SieciNeuronoweGrafy\\algorytmy-grafowe\\Trees.txt")

    adjacency_list = create_adjacency_list_from_adjacency_matrix(matrix)
    print_adjacency_list(adjacency_list)

    list_of_edges = create_list_of_edges_from_adjacency_list(adjacency_list)
    print(list_of_edges)

    dict_of_nodes = create_starting_dict_of_nodes()
    print(dict_of_nodes)

    print( len(dict_of_nodes.keys()))
    print(len(dict_of_nodes))

    trees = create_all_trees(1, list_of_edges, dict_of_nodes, adjacency_list)
    print(trees)
    print(len(trees))
















