def initiateU1():
    u = [-1] * 25
    u[6] = 1
    u[7] = 1
    u[8] = 1
    u[11] = 1
    u[13]= 1
    u[16] = 1
    u[17] = 1
    u[18] = 1
    return u

def initiateU3():
    u = [-1] * 25
    u[1] = 1
    u[2] = 1
    u[3] = 1
    u[6] = 1
    u[8] = 1
    u[11] = 1
    u[13] = 1
    u[16] = 1
    u[17] = 1
    u[18] = 1
    return u

def initiateU2():
    u = [-1] * 25
    u[6] = 1
    u[7] = 1
    u[12] = 1
    u[17] = 1
    return u

def initiateU4():
    u = [-1] * 25
    u[2] = 1
    u[7] = 1
    u[12] = 1
    u[17] = 1
    return u

def signum(number):
    if number >=0:
        return 1
    return  -1

def signumPrim(number):
    if number >=0:
        return 1
    return  0

def associate(u1, u2):
    w = [[0 for i in range(25)] for j in range(25)]
    for i in range(0, 25):
        for j in range(0, 25):
            w[i][j] =  ((u1[i] * u1[j])/25) + ((u2[i] * u2[j])/25)
    return w

def multiply(wage, vector):
    answer = [0 for i in range(25)]
    for i in range(0, len(wage)):
        for j in range(0, len(vector)):
            answer[i] += wage[i][j] * vector[j]
        answer[i] = signumPrim(answer[i])
    return answer

if __name__ == '__main__':
    u1 = initiateU1()
    u2 = initiateU2()
    u3 = initiateU3()
    u4 = initiateU4()

    wages = associate(u1, u2)
    fu1 = multiply(wages, u1)

    licznik = 0
    for i in range(5):
        print(str(fu1[licznik]) + ", " + str(fu1[licznik+1]) + ", " + str(fu1[licznik+2]) + ", " + str(fu1[licznik+3]) + ", " + str(fu1[licznik+4]))
        licznik += 5

    print()

    fu1 = multiply(wages, u2)

    licznik = 0
    for i in range(0, 5):
        print(str(fu1[licznik]) + ", " + str(fu1[licznik + 1]) + ", " + str(fu1[licznik + 2]) + ", " + str(fu1[licznik + 3]) + ", " + str(fu1[licznik + 4]))
        licznik += 5

    print()


   # wages = associate(u3, u4)
    fu1 = multiply(wages, u3)

    licznik = 0
    for i in range(0, 5):
        print(str(fu1[licznik]) + ", " + str(fu1[licznik + 1]) + ", " + str(fu1[licznik + 2]) + ", " + str(fu1[licznik + 3]) + ", " + str(fu1[licznik + 4]))
        licznik += 5

    print()

    fu1 = multiply(wages, u4)

    licznik = 0
    for i in range(0, 5):
        print(str(fu1[licznik]) + ", " + str(fu1[licznik + 1]) + ", " + str(fu1[licznik + 2]) + ", " + str(fu1[licznik + 3]) + ", " + str(fu1[licznik + 4]))
        licznik += 5

    print(wages)