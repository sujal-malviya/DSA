#Missing Number - Sum = n(n+1)/2
# mylist = [13,14,11]
# def missing(mylist):
#     indx = 0
#     for i in range(len(mylist)):
#         j= i+1
#         if (j == len(mylist)):
#             break
#         subt = abs(mylist[i] - mylist[j])
#         if(subt == 1):
#             continue
#         else:
#             indx = mylist[i]+1;
#     return indx
# print(missing(mylist))                
    
# Day 5: Finding the Missing Number in a Consecutive List
mylist = [11, 13, 14]                                           # Example list with a missing number

def missing(mylist):
    mylist.sort()                                               # Sort the list to ensure correct order
    for i in range(len(mylist) - 1):
        if mylist[i+1] - mylist[i] != 1:
            return mylist[i] + 1
    return -1                                                  # Return -1 if no missing number found

print(missing(mylist))
