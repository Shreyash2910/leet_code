class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        n=len(nums)
        nums.sort()
        a=nums[0]
        count=0
        for i in range (n):
            if nums[i]!=a:
                count=1
            count+=1
            a=nums[i]
            if count>n/2:
                return nums[i]
                break