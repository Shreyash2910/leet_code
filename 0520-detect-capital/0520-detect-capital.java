class Solution {
    public boolean detectCapitalUse(String word) {
        int cap=0;
        int low=0;
        String s= word.substring(1);
        for(char ch : s.toCharArray()){
            if(Character.isLowerCase(ch)){
                low++;
            }
            else
                cap++;
        }
        if (low==s.length())
            return true;
        else if(cap==s.length()){
            if(Character.isUpperCase(word.charAt(0)))
                return true;
        }
        return false;
    }
}