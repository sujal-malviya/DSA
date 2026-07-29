#Check if Array is sorted
mylist = [20,21,45,89,90]

def check_sorted(mylist):
    for i in range(len(mylist)-1):
        
        if (mylist[i]>mylist[i + 1]):
            return "No"
    return "Yes"

print(check_sorted(mylist))