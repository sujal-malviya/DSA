# contains duplicate -
mylist = map(int,input().split())
nums = list(mylist)
def containsDuplicate(nums) :
    seen = set()
    for num in nums :
        if num in seen:
            return True
        seen.add(num)
    return False
    
result = containsDuplicate(nums)
print(result)