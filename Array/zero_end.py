mylist = [1,2,0,4,3,0,5,0]

def Zero_ToEnd(mylist):
    result = []
    count = 0
    for i in mylist:
        if (i==0):
            count += 1
        else :
            result.append(i)
    result += [0] *count
    return result
print(Zero_ToEnd(mylist))
            