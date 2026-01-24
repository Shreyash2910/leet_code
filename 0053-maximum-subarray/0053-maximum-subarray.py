class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        sum=0
        max= -10000000000
        n=len(nums)
        for i in range (n):
            sum+=nums[i]
            if sum>max:
                max=sum
            if sum<0:
                sum=0
        return max

            