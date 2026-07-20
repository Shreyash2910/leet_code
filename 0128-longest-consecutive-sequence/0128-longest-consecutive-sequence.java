class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> x = new TreeSet<>();
        for(int i : nums){
            x.add(i);
        }
        int count=1;
        int max=0;
        for(int i :x){
            if(x.contains(i+1))
                count++;
            else
                count=1;
            
            if(max<count)
                max=count;
        }
        return max;
    }
}
