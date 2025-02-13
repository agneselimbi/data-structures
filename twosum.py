def twosum(arr,target):
    '''Given a sorted array, find index i and j such that arr[i]+arr[j]= target'''

    visited = {}
    for idx,num in enumerate(arr):
        diff = target-num
        if diff in visited:
            return visited[diff],idx
        else:
            visited[num]=idx