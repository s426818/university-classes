import math
import random
from copy import deepcopy


def f(x, beta):
    return  (1 / (1 + (math.exp(-(beta * x)))))

def countX(w, u, beta):
    x = [
        [1, 1, 1],
        [1,1,1],
        [1,1,1],
        [1,1,1]
    ]
    for pup in range (4):
        suma = 0
        currentU = u[pup]
        for i in range (2):
            currentW = w[i]
            for j in range(3):
                currentWIndex = currentW[j]
                currentUIndex = currentU[j]
                suma += currentWIndex * currentUIndex
            currentX = f(suma, beta)
            x[pup][i] = currentX
    return x


def countY(s, x, beta):
    y = [0, 0, 0, 0]
    for p in range (4):
        suma = 0
        currentX = x[p]
        for i in range(3):
            currentS = s[i]
            currentXIndex = currentX[i]
            suma += currentS * currentXIndex
        currentY = f(suma, beta)
        y[p] = currentY
    return y

def fPrim(x, beta):
    return  (beta * (math.exp(-beta * x))) / (math.pow((1 + (math.exp(-beta * x))), 2))
    #(beta * f(x, beta) * (1 - f(x, beta)))

def gradientS(s, index, y, z, x, beta):
    suma = 0
    for p in range (4):
        currentY = y[p]
        currentZ = z[p]
        firstValue = currentY - currentZ
        # suma += (currentY - currentZ)
        currentX = x[p]
        sumaForFPrim = 0
        for k in range(3):
            currentS = s[k]
            currentIndexX = currentX[k]
            sumaForFPrim += currentS * currentIndexX
        valueFPrim = fPrim(sumaForFPrim, beta)
        thirdValue = currentX[index]
        suma += firstValue * valueFPrim * thirdValue
    return  suma

def newGradientS(s, index, y, z, x, beta):
    print()

def gradientW(w, indexI, indexY, x, beta, s, u, y):
    suma = 0
    for p in range(4):
        currentY = y[p]
        currentZ = z[p]
        firstValue = currentY - currentZ
        currentX = x[p]
        sumaForFPrim1 = 0
        for k in range(3):
            currentS = s[k]
            currentIndexX = currentX[k]
            sumaForFPrim1 += currentS * currentIndexX
        secondValue = fPrim(sumaForFPrim1, beta)
        thirdValue = s[indexI]
        sumForPrim2 = 0
        currentW = w[indexI]
        currentU = u[p]
        for l in range(3):
            currentWIndex = currentW[l]
            currentUIndex = currentU[l]
            sumForPrim2 +=  currentWIndex * currentUIndex
        fourthValue = fPrim(sumForPrim2, beta)
        fifthValue = currentU[indexY]
        suma += firstValue * secondValue * thirdValue * fourthValue * fifthValue
    return  suma

def findMax(s, new_s, w, new_w):
    max = -1
    for i in range(3):
        if max < abs(new_s[i] - s[i]):
            max = abs(new_s[i] - s[i])
    for i in range(2):
        for j in range(3):
            if max < abs(new_w[i][j] - w[i][j]):
                max = abs(new_w[i][j] - w[i][j])
    return max

if __name__ == '__main__':
    print("hello")

    c = 0.3
    epsilon = 0.0001
    beta = 1.5



    # wejścia
    u1 = [0, 0, 1]
    u2 = [1, 0, 1]
    u3 = [0, 1, 1]
    u4 = [1, 1, 1]
    u = [u1, u2, u3, u4]

    # sygnały nauczyciela
    z = [0, 1, 1, 0]

    # stały warunek początkowy
    # w1 = [0.0, 1.0, 2.0]
    # w2 = [0.0, 1.0, 2.0]
    w1 = [0.5, 1.0, 2.0]
    w2 = [0.5, 1.0, 2.0]
    w = [w1, w2]
    s    = [0.0, 1.0, 2.0]

    # czy losowy warunek początkowy
    print("Losować?")
    cond = input()
    if cond == "tak":
        n = 3
        for i in range(3):
            s[i] = random.uniform(-n, n)
            for j in range(2):
                w[j][i] = random.uniform(-n, n)

    # wyliczamy x i y
    x = countX(w, u, beta)
    y = countY(s, x, beta)

    # po raz peirwszy liczymy new s i new w
    new_w1 = [0.0, 1.0, 2.0]
    new_w2 = [0.0, 1.0, 2.0]
    new_w = [new_w1, new_w2]
    new_s = [0.0, 1.0, 2.0]

    for i in range(len(s)):
        new_s[i] = s[i] - c * gradientS(s, i, y, z, x, beta)
    for i in range(len(w)):
        for j in range(len(w[i])):
            new_w[i][j] = w[i][j] - c * gradientW(w, i, j, x, beta, s, u, y)

    # pierwszy raz liczymy różnice
    max = findMax(s, new_s, w, new_w)

    k = 0

    while(max > epsilon):
        s = deepcopy(new_s)
        w = deepcopy(new_w)
        for i in range(len(s)):
            new_s[i] = s[i] - c * gradientS(s, i, y, z, x, beta)
        for i in range(len(w)):
            for j in range(len(w[i])):
                new_w[i][j] = w[i][j] - c * gradientW(w, i, j, x, beta, s, u, y)
        max = findMax(s, new_s, w, new_w)
        k += 1
        if k % 100 == 0:
            print(k)

        # wyliczamy x i y
        x = countX(w, u, beta)
        y = countY(s, x, beta)

    x = countX(w, u, beta)
    y = countY(s, x, beta)
    print("Wartość x: " + str(x))
    print("\n")
    print("Wartość y: " + str(y))
    print("\n")
    #

