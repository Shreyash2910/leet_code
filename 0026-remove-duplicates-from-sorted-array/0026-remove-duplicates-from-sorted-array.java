class Solution {
    public int removeDuplicates(int[] nums) {
        int[] arr = new int[nums.length];
        int count=1,x=0;
        arr[x]=nums[0];
        for(int i = 1;i<nums.length;i++){
            if(arr[x]!=nums[i]){
                arr[++x]=nums[i];
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            nums[i] = arr[i];
        }
        return count;
    }
}