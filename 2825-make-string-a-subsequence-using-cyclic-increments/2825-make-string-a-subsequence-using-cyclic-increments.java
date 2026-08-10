class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int count=0;
        for(int i=0;i<str1.length();i++){
            char ch1= str1.charAt(i);
            char ch2= str2.charAt(count);
            char next;
            if(ch1=='z')
                next='a';
            else
                next=(char)(ch1+1);
            if(ch1==ch2||next == ch2)
                count++;
            if(count==str2.length())
            return true;
        }
        return false;
    }
}