import math
from copy import deepcopy
from math import  gcd
from random import randint

def dl_problem(a, n, r):
    modulo = math.pow(a, r) % n
    if modulo == 1:
        return r
    else:
        return dl_problem(a, n, r+1)

def dl_problem_3(a, n, r):
    if pow(a, r, n) == 1:
        return r
    else:
        return dl_problem_3(a, n, r+1)

def dl_problem_2(a, n):
    r = 1
    while math.pow(a, r) % n != 1:
        r += 1
    return r

if __name__ == '__main__':
    print()
    N_tab = [5, 12, 91, 57, 143, 1737, 1859, 13843, 988027]
    example = 12
    condition = True
    # a = randint(1, 11)
    # gcd_value = gcd(example, a)
    # if gcd_value > 1:
    #     print(gcd_value)
    #     condition = False
    #
    # #r = dl_problem(a, example, 1)



    while condition:
        a = randint(1, example-1)
        gcd_value = gcd(example, a)
        if gcd_value > 1:
            print(a)
            print(gcd_value)
            condition = False
            break
        r = dl_problem(a, example, 1)
        modulo = r % 2
        if modulo == 1:
            continue
        else:
            r = r/2
            print(r)
            print(a)
            gcd_value_1 = gcd(example, int(pow(a, r) + 1))
            gcd_value_2 = gcd(example, int(pow(a, r)  - 1))
            if (gcd_value_1 == 1 and gcd_value_2 == 1):
                continue
            else:
                condition = False
                print(gcd_value_1, gcd_value_2)

    for ex in N_tab:
        print("Printuję dla: " + str(ex))
        condition = True
        while condition:
            a = randint(1, ex - 1)
            gcd_value = gcd(ex, a)
            if gcd_value > 1:
                print(a)
                print(gcd_value)
                condition = False
                break
            r = dl_problem_3(a, ex, 1)
            modulo = r % 2
            if modulo == 1:
                continue
            else:
                r = r / 2
                print(r)
                print(a)
                gcd_value_1 = gcd(ex, int(pow(a, r) + 1))
                gcd_value_2 = gcd(ex, int(pow(a, r) - 1))
                if (gcd_value_1 == 1 and gcd_value_2 == 1):
                    continue
                else:
                    condition = False
                    print(gcd_value_1, gcd_value_2)

