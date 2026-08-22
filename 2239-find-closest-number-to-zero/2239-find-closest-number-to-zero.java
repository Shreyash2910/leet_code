class Solution {
    public int findClosestNumber(int[] nums) {
        int min=nums[0];
        int result=0;
        for (int i =1; i<nums.length;i++){
            result= nums[i];
            if(Math.abs(result)<Math.abs(min)){
                min = nums[i];
            }
            else if(Math.abs(result)==Math.abs(min)){
                min = Math.max(min, result);
            }
        }
        return min;
    }
}