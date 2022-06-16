import math

# endoder



def sumForFY(w, x, b, i, alfa):
    suma = 0
    currentW = w[i]
    currentB = b[i]
    suma += currentB
    currentX = x[alfa]
    for j in range(2):
        currentWJ = currentW[j]
        currentXAlfa = currentX[j]
        suma += currentWJ * currentXAlfa
    return suma

def countYI(w, x, b, i, alfa):
    return  f(sumForFY(w, x, b, i, alfa))

def countY(w, x, b,):
    y = [1] * 2
    for alfa in range(2):
        y[alfa] = countYI(w, x, b, 1, alfa)
    return  y

# dekoder

def sumForFXPrim(w_prim, y, b_prim, k, alfa):
    currentWPrim = w_prim[k]
    currentBPrim = b_prim[k]
    suma = 0
    suma += currentBPrim
    currentY = y[alfa]
    suma += currentWPrim * currentY
    return suma

def countXPrimAlfaK(w_prim, y, b_prim, k, alfa):
    return f(sumForFXPrim(w_prim, y, b_prim, k, alfa))

def countXPrim(w_prim, y, b_prim):
    x_prim = [[0] * 2] * 2
    for alfa in range(2):
        for k in range(2):
            x_prim[alfa][k] = countXPrimAlfaK(w_prim, y, b_prim, k, alfa)
    return x_prim

def f1(x):
    if x < 0:
        return 0
    else:
        return 1

def countXBis(w_prim, y, b_prim):
    x_bis = [[0] * 2] * 2
    for alfa in range(2):
        for k in range(2):
            x_bis[alfa][k] = f1(sumForFXPrim(w_prim, y, b_prim, k, alfa))
    return x_bis






def f(x, beta):
    return  (1 / (1 + (math.exp(-(beta * x)))))


def encodeYalpha(w, xalpha, b, beta):
    suma = 0
    for j in range(2):
        wij = w
        xj = xalpha[j]
        suma += wij * xj
    suma += b[0]
    return f(suma, beta)

def encodeY(w, x, b, beta):
    y = []
    for alpha in range(2):
        y.append(encodeYalpha(w[0], x[alpha], b, beta))
    return y

def f1(x):
    if x < 0:
        return 0
    else:
        return 1

def decodeXalphakPrim(wkprim, yalpha, bkprim, beta):
    suma = 0
    suma += wkprim * yalpha
    suma += bkprim
    return f(suma, beta)

def decodeXPrim(wprim, y, bprim, beta):
    xprim = []
    for alpha in range(2):
        temp = []
        for k in range(2):
            xk = decodeXalphakPrim(wprim[k], y[alpha], bprim[k], beta)
            temp.append(xk)
        xprim.append(temp)
    return xprim

#def decodeXAlphakBis()



if __name__ == '__main__':
    print("hello")

    x1 = [1.0, 0.0]
    x2 = [0.0, 1.0]
    x = [x1, x2]

    w = [0.35, 1.25]
    b = [-0.3]

    bprim = [-2, 0.57]
    wprim = [-0.2, 0.7]

    beta = 1.5

    y = encodeY(w, x, b, beta)
    xprim = decodeXPrim(wprim, y, bprim, beta)

    print(y)
    print(x)

    print(f(bprim[1] + wprim[1], beta))




