class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        s=set(nums)
        longest=0

        for x in s:
            if not x-1 in s:
                a=x
                length =1
                while a+1 in s:
                    length+=1
                    a+=1
                longest= max(longest,length)
        return longest  

        
        
        
