class Solution {
    public long countSubstrings(String s, char c) {
        int count=0;
        long result=0;
        for(int i =0; i<s.length();i++){
            if(s.charAt(i)==c){
                count++;
                result= result + count;
            }
            
        }
        return result;
    }
}