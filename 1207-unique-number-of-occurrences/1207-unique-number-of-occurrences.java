class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map= new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i,1);
        }
        for(int i : map.values()){
            if (!set.add(i)) {
                return false;
            }
        }
        return true;
    }
}