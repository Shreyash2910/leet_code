class Solution {
    public int minDeletionSize(String[] strs) {
        int count=0;
        String s="";
        for(int i =0;i<strs.length;i++)
            s=s.concat(strs[i]);
        for(int i =0;i<strs[0].length();i++){
            int c=i;
            for(int j = 0; j<(strs.length)-1; j++){
                if (s.charAt(c) > s.charAt(c+strs[0].length())){
                    count++;
                    break;
                }
                c=c+strs[0].length();
            }
        }
        return count;
    }
}