import math
from copy import deepcopy

def f1(x):
    if x < 0:
        return 0
    else:
        return 1

def getProperIndexes(indexX, indexY):
    indexXToReturn = 0
    indexYToReturn = 0
    if indexX == -1:
        indexXToReturn = 0
    elif indexX == 0:
        indexXToReturn = 1
    elif indexX == 1:
        indexXToReturn = 2
    if indexY == -1:
        indexYToReturn = 0
    elif indexY == 0:
        indexYToReturn = 1
    elif indexY == 1:
        indexYToReturn = 2
    return (indexXToReturn, indexYToReturn)

def countXij(wn, un, indexI, indexJ):
    suma = 0
    for i in range(-1, 2, 1):
        for j in range(-1, 2, 1):
            properIndexes = getProperIndexes(i, j)
            # print(properIndexes)
            # print(indexI-i)
            # print(indexJ-j)
            # print(wn)
            # print(un)
            suma += wn[properIndexes[0]][properIndexes[1]] * un[(indexI - i) - 1][(indexJ-j) - 1]
    return f1(suma)

def convolution(w, u):
    x = []
    for i in range(len(w)):
        temp = []
        for j in range(len(u)):
            xij = countXij(w[i], u[j], j, i)
            temp.append(xij)
        x.append(temp)
    return x

def definePij(indexI, indexJ):
    pij = []
    for k in range(0, 4):
        for l in range(0, 4):
            pij.append((indexI + k, indexJ + l))
    return pij

def pooling(w, u):
    y = []
    x= convolution(w, u)
    print(x)
    for i in range(2):
        temp = []
        for j in range(2):
            pij = definePij(i, j)
            suma = 0
            for (p, q) in pij:
                #print(p, q)
                suma += x[p-1][q-1]
            # temp.append(f1((1/9) * (suma)))
            temp.append(f1((1 / 16) * (suma)))
        y.append(temp)
    return y

if __name__ == '__main__':
    print("hello")

    u1 = [
        [0, 0, 0, 0, 0],
        [0, 1, 1, 1, 0],
        [0, 1, 0, 1, 0],
        [0, 1, 1, 1, 0],
        [0, 0, 0, 0, 0]
    ]

    u2 = [
        [0, 0, 0, 0, 0],
        [0, 0, 0, 0, 0],
        [1, 1, 1, 0, 0],
        [1, 0, 1, 0, 0],
        [1, 1, 1, 0, 0]
    ]

    u3 = [
        [0, 0, 0, 0, 0],
        [0, 1, 1, 0, 0],
        [0, 0, 1, 0, 0],
        [0, 0, 1, 0, 0],
        [0, 0, 1, 0, 0]
    ]

    u4 = [
        [0, 0, 1, 1, 0],
        [0, 0, 0, 1, 0],
        [0, 0, 0, 1, 0],
        [0, 0, 0, 1, 0],
        [0, 0, 0, 0, 0]
    ]

    u5 = [
        [0, 0, 0, 0, 0],
        [1, 1, 0, 0, 0],
        [0, 1, 0, 0, 0],
        [0, 1, 0, 0, 0],
        [0, 1, 0, 0, 0]
    ]

    u = [u1, u2, u3, u4, u5]

    w1 = [
        [1, 1, 1],
        [1, 0, 0],
        [1, 0, 0]
    ]

    w2 = [
        [0, 0, 1],
        [0, 0, 1],
        [1, 1, 1]
    ]

    w3 = [
        [1, 1, 0],
        [0, 1, 0],
        [0, 1, 0]
    ]

    w4 = [
        [0, 1, 0],
        [0, 1, 0],
        [0, 1, 0]
    ]

    w = [w1, w2, w3, w4]

    y = pooling(w, u)

    print(y)

