class Solution {
    public void rotate(int[] nums, int k) {
        int l = nums.length-1;
        k=k%nums.length;
        int [] arr = new int[l+k+1];
        
        for(int i =k-1; i>=0;i--){
            arr[i]= nums[l];
            l--;
        }
        int a=0;
        for(int i =k ; i<=nums.length-1;i++){
            arr[i]=nums[a];
            a++;
        }
        for(int i =0 ; i<=nums.length-1;i++){
            nums[i]=arr[i];
        }
    }
}