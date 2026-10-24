class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> x= new HashSet<>();
        for(int i : nums){
            if(x.contains(i)){
                return true;
            }
            x.add(i);
        }
        return false;
    }
}
