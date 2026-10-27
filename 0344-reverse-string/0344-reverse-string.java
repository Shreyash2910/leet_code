class Solution {
    public void reverseString(char[] s) {
        int l = s.length-1;
        char temp;
        int i=0;
        while(i<l){
            temp= s[i];
            s[i]=s[l];
            s[l]=temp;
            i++;
            l--;
        }
    }
}