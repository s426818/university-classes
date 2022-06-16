from random import uniform

def  f1x1(x1, x2):
    return  4 * x1 - 2 * x2 - 2

def  f1x2(x1, x2, x3):
    return  4 * x2 - 2 * x1 - 2 * x3

def  f1x3(x2, x3):
    return  2 * x3 - 2 * x2

def f1(x):
    return (2 * (x[0] * x[0]) + (2 * (x[1] * x[1])) + (x[2] * x[2]) - (2 * x[0] * x[1]) - (2 * x[1] * x[2]) - (2 * x[0]) +3)

def  f2x1(x1):
    return  12 * (x1 * x1 * x1) + 12 * (x1 * x1)  - 24 * x1

def  f2x2(x2):
    return  24 * x2 - 24

def f2(x):
    return ((3 * (x[0] * x[0] * x[0] * x[0])) + (4 * (x[0] * x[0] * x[0])) - (12 * x[0] * x[0]) + (12 * (x[1] * x[1])) - (24 * x[1]))

def countNewX1(x, c):
    newX = [0] * len(x)
    newX[0] = x[0] - c * (f1x1(x[0], x[1]))
    newX[1] = x[1] - c * (f1x2(x[0], x[1], x[2]))
    newX[2] = x[2] - c * (f1x3(x[1], x[2]))
    return  newX

def countNewX2(x, c):
    newX = [0] * len(x)
    newX[0] = x[0] - c * (f2x1(x[0]))
    newX[1] = x[1] - c * (f2x2(x[1]))
    return  newX

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
    c = 0.0001
    epsilon = 0.00001

    # f2 non-random
    x2 = [-5, 7]
    newX2 = countNewX2(x2, c)
    maxDifference = findMaxDifferenceX2(x2, newX2)
    while maxDifference > epsilon:
        #print("new x: " + str(x2))
        #print("F(x): " + str(f2(x2)))
        x2 = newX2
        newX2 = countNewX2(x2, c)
        maxDifference = findMaxDifferenceX2(x2, newX2)

    print("new x: " + str(x2))
    print("F(x): " + str(f2(x2)))

    # f3 non-random
    x1 = [-5, 7, 24]
    newX1 = countNewX1(x1, c)
    maxDifference = findMaxDifferenceX1(x1, newX1)
    while maxDifference > epsilon:
        # print("new x: " + str(x2))
        # print("F(x): " + str(f2(x2)))
        x1 = newX1
        newX1 = countNewX1(x1, c)
        maxDifference = findMaxDifferenceX1(x1, newX1)

    print("new x: " + str(x1))
    print("F(x): " + str(f1(x1)))



    #epsilon = 0.00000001

    # f2 random
    x21 = uniform(-2,2)
    x22 = uniform(-2,2)
    x2 = [x21, x22]
    newX2 = countNewX2(x2, c)
    maxDifference = findMaxDifferenceX2(x2, newX2)
    while maxDifference > epsilon:
        x2 = newX2
        newX2 = countNewX2(x2, c)
        maxDifference = findMaxDifferenceX2(x2, newX2)


    print("new x: " + str(x2))
    print("F(x): " + str(f2(x2)))

    # f3 random
    x11 = uniform(-2, 2)
    x12 = uniform(-2, 2)
    x13 = uniform(-2, 2)
    x1 = [x11, x12, x13]
    newX1 = countNewX1(x1, c)
    maxDifference = findMaxDifferenceX1(x1, newX1)
    while maxDifference > epsilon:
        # print("new x: " + str(x2))
        # print("F(x): " + str(f2(x2)))
        x1 = newX1
        newX1 = countNewX1(x1, c)
        maxDifference = findMaxDifferenceX1(x1, newX1)

    print("new x: " + str(x1))
    print("F(x): " + str(f1(x1)))