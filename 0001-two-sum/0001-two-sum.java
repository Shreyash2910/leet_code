class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> x = new HashMap<>();
        int rem=0;
        for(int i=0; i<nums.length; i++){
            rem= target-nums[i];
            if (x.containsKey(rem)){
                return new int[] {x.get(rem),i};
            } 
            x.put(nums[i],i);
        }
        return new int[] {};
    }
}