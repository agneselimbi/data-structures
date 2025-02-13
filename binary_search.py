def binary_search(arr,target):
    '''Executes a binary search on a sorted array'''
    l,r = 0,len(arr)-1    
    while l<r:
        mid = (l+r)//2
        if arr[mid]>target:
            r = mid
            print(l,arr[l])
        elif arr[mid]<target:
            l = mid
            print(r,arr[r])
        else:
            return mid
    return -1

if __name__ == "__main__":
    arr = [1,3,4,5,7,8,9]
    target = 8
    print(binary_search(arr,target))
