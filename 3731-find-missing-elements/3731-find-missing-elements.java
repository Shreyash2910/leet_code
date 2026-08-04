class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        TreeSet <Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i : nums){
            set.add(i);
        }
        int min= set.first();
        int max= set.last();
        while (min<max){
            min++;
            if(!set.contains(min))
                list.add(min);
        }
        return list;
    }
}