def threeSum(nums):
    "Given an array, the goal is to find indexes i,j,k such that arr[i]+arr[j]+arr[k]=0"
    
    nums.sort()
    print(nums)
    res = []
    for i in range(len(nums)):
        print("index is",i)
        if nums[i]>0:
            break
        if i>0 and nums[i-1] == nums[i]:
            continue
        l,r = i+1,len(nums)-1
        while l<r:
            threeSum = nums[i]+nums[l]+nums[r]
            print("threesum= ",threeSum)
            if threeSum>0:
                r -=1
            elif threeSum<0:
                l+=1
            else:
                if nums[l-1]==nums[l]:
                    l+=1
                else:
                    res.append([nums[i],nums[l],nums[r]])
                    l+=1
                    while nums[l-1]==nums[l] and l<r:
                        l+=1
    return res
            
if __name__ == "__main__":
    nums=[-1,0,1,2,-1,4]
    print(threeSum(nums))