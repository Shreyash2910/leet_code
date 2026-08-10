class Solution {
    public int numSub(String s) {
        int result=0;
        long count=0;
        int MOD= 1_000_000_007;
        for(int i =0; i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
            else{
                result= (int)((result+(count*(count+1)/2))%MOD);
                count=0;
            }
        }
        if(s.charAt(s.length()-1)=='1')
            result= (int)((result+(count*(count+1)/2))%MOD);
        return result;
    }
}