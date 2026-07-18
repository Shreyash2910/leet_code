class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> x= new HashMap<>();
        int count=1;
        for(int i : nums){
            if(x.containsKey(i)){
                return true;
            }
            x.put(i,count);
        }
        return false;
    }
}
