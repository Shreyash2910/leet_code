class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i : nums){
            set.add(i);
            if(i<min)
                min=i;
            if(i>max)
                max=i;
        }
        while (min<max){
            min++;
            if(!set.contains(min))
                list.add(min);
        }
        return list;
    }
}