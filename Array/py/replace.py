
def replaceElements( arr ):

    max_so_far = -1
    for i in range(len(arr) - 1, -1, -1):
        current = arr[i]
        arr[i] = max_so_far
        max_so_far = max(max_so_far, current)
    return arr

arr = [17,18,5,4,6,1]

result = replaceElements(arr)
print(result)