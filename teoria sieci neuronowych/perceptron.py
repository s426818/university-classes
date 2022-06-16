def initiateU1():
    u = [0] * 26
    u[6] = 1
    u[7] = 1
    u[8] = 1
    u[11] = 1
    u[13]= 1
    u[16] = 1
    u[17] = 1
    u[18] = 1
    u[25] = 1
    return u

def initiateU2():
    u = [0] * 26
    u[10] = 1
    u[11] = 1
    u[12] = 1
    u[15] = 1
    u[17]= 1
    u[20] = 1
    u[21] = 1
    u[22] = 1
    u[25] = 1
    return u

def initiateU3():
    u = [0] * 26
    u[6] = 1
    u[7] = 1
    u[12] = 1
    u[17] = 1
    u[22]= 1
    u[25] = 1
    return u

def initiateU4():
    u = [0] * 26
    u[2] = 1
    u[3] = 1
    u[8] = 1
    u[13] = 1
    u[25] = 1
    return u

def initiateU5():
    u = [0] * 26
    u[5] = 1
    u[6] = 1
    u[11] = 1
    u[16] = 1
    u[21]= 1
    u[25] = 1
    return u

if __name__ == '__main__':
    u1 = initiateU1()
    u2 = initiateU2()
    u3 = initiateU3()
    u4 = initiateU4()
    u5 = initiateU5()
    vectors = [u1, u2, u3, u4, u5]
    print(vectors)
    uminus = set()
    uminus.add("u1")
    uminus.add("u2")
    uplus = set()
    uplus.add("u3")
    uplus.add("u4")
    uplus.add("u5")

    c = 1
    t = 1
    weight = [1] * 26
    counter = 0
    while(counter < 5):
        indexOfCurrentU = (t-1) % 5
        currentU = vectors[indexOfCurrentU].copy()
        currentWeight = weight.copy()
        currentZ = 0
        if(indexOfCurrentU > 1):
            currentZ = 1
        currentY = 0;
        for i in range(0, 26):
            currentY += currentWeight[i]*currentU[i]
        if currentY < 0:
            currentY = 0
        else:
            currentY = 1
        if(currentZ == currentY):
            counter += 1
        else:
            counter = 0
        for i in range(0, 26):
            currentWeight[i] = currentWeight[i] + ((c * (currentZ - currentY)) * currentU[i])
        weight = currentWeight.copy()
        t += 1

    print("c: " + str(c))
    print("t: " + str(t))
    print("w: " + str(weight))

    c = 0.1
    t = 1
    weight = [1] * 26
    counter = 0
    while (counter < 5):
        indexOfCurrentU = (t - 1) % 5
        currentU = vectors[indexOfCurrentU].copy()
        currentWeight = weight.copy()
        currentZ = 0
        if (indexOfCurrentU > 1):
            currentZ = 1
        currentY = 0;
        for i in range(0, 26):
            currentY += currentWeight[i] * currentU[i]
        if currentY < 0:
            currentY = 0
        else:
            currentY = 1
        if (currentZ == currentY):
            counter += 1
        else:
            counter = 0
        for i in range(0, 26):
            currentWeight[i] = currentWeight[i] + ((c * (currentZ - currentY)) * currentU[i])
        weight = currentWeight.copy()
        t += 1

    print("c: " + str(c))
    print("t: " + str(t))
    print("w: " + str(weight))

    c = 0.01
    t = 1
    weight = [1] * 26
    counter = 0
    while (counter < 5):
        indexOfCurrentU = (t - 1) % 5
        currentU = vectors[indexOfCurrentU].copy()
        currentWeight = weight.copy()
        currentZ = 0
        if (indexOfCurrentU > 1):
            currentZ = 1
        currentY = 0;
        for i in range(0, 26):
            currentY += currentWeight[i] * currentU[i]
        if currentY < 0:
            currentY = 0
        else:
            currentY = 1
        if (currentZ == currentY):
            counter += 1
        else:
            counter = 0
        for i in range(0, 26):
            currentWeight[i] = currentWeight[i] + ((c * (currentZ - currentY)) * currentU[i])
        weight = currentWeight.copy()
        t += 1

    print("c: " + str(c))
    print("t: " + str(t))
    print("w: " + str(weight))