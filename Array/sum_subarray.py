#Sum of All Subarray-
mylist =[1,4,5,3,2]

def SumOfAllSubarray(mylist):
    result = 0
    for i in range(len(mylist)): #(0<5)
        curr_sum = 0 
        for j in range(i,len(mylist)):  #(0->start,5)
            curr_sum += mylist[j]
            result += curr_sum
    return result

print(SumOfAllSubarray(mylist))