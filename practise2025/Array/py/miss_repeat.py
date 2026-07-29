arr = [3,1,3]
def findTwoElement(arr):
    n = len(arr)
    sum_n = n * (n + 1) // 2
    sum_sq_n = n * (n + 1) * (2 * n + 1) // 6

    sum_arr = sum(arr)
    sum_sq_arr = sum(x * x for x in arr)

    diff = sum_arr - sum_n           
    sq_diff = sum_sq_arr - sum_sq_n  

    sum_xy = sq_diff // diff        

    x = (diff + sum_xy) // 2  
    y = x - diff              

    return [x, y]

print(findTwoElement(arr))
