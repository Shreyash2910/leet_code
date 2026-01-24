class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        prefix_sum=0
        count = 0
        hash={0:1}
        for num in nums:
            prefix_sum+=num
            if (prefix_sum-k) in hash:
                count+= hash[prefix_sum-k]
            hash[prefix_sum] = hash.get(prefix_sum, 0) + 1
        return count