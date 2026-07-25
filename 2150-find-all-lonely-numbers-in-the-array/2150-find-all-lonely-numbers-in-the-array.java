class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer,Integer> map= new HashMap<>();
        ArrayList<Integer> lonely = new ArrayList<>();
        for(int i : nums){
            set.add(i);
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(int i : map.keySet()){
            if (map.get(i)<2)
                if(set.contains(i) && !set.contains(i+1)&&!set.contains(i-1)){
                    lonely.add(i);
                }
        }
        return lonely;
    }
}