class Solution:
    def threeSum(self, num: List[int]) -> List[List[int]]:
        num.sort()
        n=len(num)
        res=[]
        for i in range(0,n-1):
            if i>0 and num[i]==num[i-1]:
                continue
            left, right= i+1 , n-1
            while left<right:
                total=num[i]+num[left]+num[right]
                if total==0:
                    res.append([num[i],num[left],num[right]])
                    left=left+1
                    right=right-1
                    while left < right and num[left] == num[left - 1]: 
                        left += 1
                elif total<0:
                    left+=1
                else:
                    right-=1
        return res