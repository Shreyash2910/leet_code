class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int sum=0;
        int a;
        for(int i : map.keySet()){
            a= map.get(i);
            sum+= a*(a-1)/2;
        }
        return sum;
    }
}