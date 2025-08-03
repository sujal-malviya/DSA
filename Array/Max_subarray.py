#Maximum Subarray Sum - Kadane's Algorithm

mylist = [2,3,-8,7,-1,2,3]

def Max_subarray_Sum(mylist):
    n = len(mylist)
    unique = {0}
    maximum = -99
    for i in range(n):
        if(mylist[i] > maximum):
            maximum = mylist[i]
            maximum += mylist[i]
    return maximum

result = Max_subarray_Sum(mylist)
print(result)