class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        int a=0;
        for(int i =0; i<= nums.length; i++){
            if(!set.contains(a)){
                return a;
            }
            a++;
        }
        return a;
    }
}