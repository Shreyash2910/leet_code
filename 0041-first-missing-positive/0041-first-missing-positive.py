class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        s = set(nums)
        n = len(nums)

        for x in range(1, n + 2):   
            if x not in s:
                return x