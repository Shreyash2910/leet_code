class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        n = len(nums)

        i = 0
        while i < n:
            x = nums[i]
            correct = x - 1

            if 1 <= x <= n and nums[i] != nums[correct]:
                nums[i], nums[correct] = nums[correct], nums[i]
            else:
                i += 1

        for i in range(n):
            if nums[i] != i + 1:
                return i + 1

        return n + 1