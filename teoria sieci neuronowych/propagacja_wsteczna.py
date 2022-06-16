from random import uniform
from math import exp

def f(x, beta):
    wykładnik = -(beta * x)
    exponential = exp(wykładnik)
    mianownik = 1 + exponential
    return 1/mianownik

def  x(wagi, wejściowe_wektory, indeks_p, indeks_wag, beta):
    wektor = wejściowe_wektory[indeks_p]
    suma = 0
    wektor_wag = wagi[indeks_wag]
    for j in range (3):
        suma += wektor_wag[j] * wektor[j]
    return f(suma, beta)

def y(s, wektor_x, indeks_p, beta):
    wektor = wektor_x[indeks_p]
    suma = 0
    for i in range(3):
        suma += s[i] * wektor[i]
    return f(suma, beta)

def initializeW12S():
    w1 = [0] * 3
    w1[1] = 1
    w1[2] = 2
    w2 = [0] * 3
    w2[1] = 1
    w2[2] = 2
    s = [0] * 3
    s[1] = 1
    s[2] = 2
    return w1, w2, s

def findMaxDifferenceX2(oldX, newX):
    dif0 = abs(oldX[0] - newX[0])
    dif1 = abs(oldX[1] - newX[1])
    if dif0 > dif1:
        return dif0
    else:
        return dif1

def findMaxDifferenceX1(oldX, newX):
    dif0 = abs(oldX[0] - newX[0])
    dif1 = abs(oldX[1] - newX[1])
    dif2 = abs(oldX[2] - newX[2])
    if dif0 > dif1:
        if dif0 > dif2:
            return dif0
        else:
            return dif2
    else:
        if dif1 > dif2:
            return dif1
        else:
            return dif2

if __name__ == '__main__':
    c = 0.1
    epsilon = 0.0001
    beta = 1

    # sygnał nauczyciela
    z = [0] * 4
    z[1] = 1
    z[2] = 1

    # input
    u1 = [0, 0, 1]
    u2 = [1, 0, 1]
    u3 = [0, 1, 1]
    u4 = [1, 1, 1]
    u = [u1, u2, u3, u4]

    w1 = [0.0, 1.0, 2.0]
    w2 = [0.0, 1.0, 2.0]
    w = [w1, w2]

    s = [0.0, 1.0, 2.0]

    x11 = x(w, u, 0, 1, beta)
    x12 = x(w, u, 0, 2, beta)
    x13 = 1
    x1 = [x11, x12, x13]

    x21 = x(w, u, 1, 1, beta)
    x22 = x(w, u, 1, 2, beta)
    x23 = 1
    x2 = [x21, x22, x23]

    x31 = x(w, u, 2, 1, beta)
    x32 = x(w, u, 2, 2, beta)
    x33 = 1
    x3 = [x31, x32, x33]

    x41 = x(w, u, 3, 1, beta)
    x42 = x(w, u, 3, 2, beta)
    x43 = 1
    x4 = [x41, x42, x43]

    x = [x1, x2, x3, x4]

    y1 = y(s, x, 0, beta)
    y2 = y(s, x, 1, beta)
    y3 = y(s, x, 2, beta)
    y4 = y(s, x, 3, beta)

    y = [y1, y2, y3, y4]



