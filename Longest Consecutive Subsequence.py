'''
https://practice.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1
So, the idea is:
  1. Find start of sequence.
  2. Increment the element by one each time and check if that element exists in array.
  3. When next incremented element in not in array store the max length
  
for a = [1,8,2,7,3,6,4]
there are 2 sequences 1,2,3,4 and 6,7,8 and our condition checks for beginning of sequence by subtracting 1.
1-1 = 0 is not is array so its one sequence start.
6-1 = 5 is not is array so its 2nd sequence start.
'''

def findLongestConseqSubseq(a,n):
    uDict = {}
    for i in range(n):
        uDict[a[i]] = 1
    
    cmax = 0
    
    for i in range(n):
        if a[i] - 1 not in uDict:
            e = a[i]
            while e in uDict:
                e += 1
            cmax = max(cmax, e - a[i])
    
    return cmax

a = [2, 6, 1, 9, 4, 5, 3]
n = len(a)
print(findLongestConseqSubseq(a,n))
