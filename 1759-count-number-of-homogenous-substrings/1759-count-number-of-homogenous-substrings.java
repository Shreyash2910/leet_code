class Solution {
    public int countHomogenous(String s) {
        int len=1;
        int end=1;
        int MOD = (int) 1e9 + 7;
        if(s.length()==0)
            return 0;
        for(int i =1; i< s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1))
                len=1;
            else
                len++;
            end=(end+len) % MOD;
        }
        return end ;
    }
}