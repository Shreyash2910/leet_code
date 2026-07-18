class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> x= new HashMap<>();
        int count = 1;
        for(int i : nums){
            if(x.containsKey(i))
                if((count-(x.get(i)))<=k)
                    return true;
                else
                    x.put(i,count);
            else
                x.put(i,count);
            count++;
        }
        return false;
    }
}