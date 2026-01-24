class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        n= len(nums)
        arr=[0]*n
        even=0
        odd=1
        for i in range (n):
            if nums[i]<0:
                arr[odd]=nums[i]
                odd+=2
            else:
                arr[even]=nums[i]
                even+=2
        return arr