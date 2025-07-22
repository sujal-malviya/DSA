
    sum_xy = sq_diff // diff        

    x = (diff + sum_xy) // 2  
    y = x - diff              

    return [x, y]

print(findTwoElement(arr))
