def longest_subset(arr):
    """"Given an array, the goal is to find the longest consecutive subset 
    example: longest_subset([10,1,4,3,3,2) will return [1,2,3,4]"""

    myset = set(arr)
    max=0
    for num in arr:
        temp = 1
        n = num
        while n-1 in myset:
            temp+=1
            n-=1
        if temp>= max:
            max=temp
        else:
            max=max
    return max
if __name__ =="__main__":
    arr= [10,1,4,3,3,2]
    arr=[]
    print(longest_subset(arr))

