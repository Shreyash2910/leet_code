class Solution {
    public String reverseWords(String s) {
        String temp="";
        String rev="";
        s=" "+s;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==32){
                System.out.println(temp);
                rev=temp+" "+rev;
                temp="";
                continue;
            }
            temp= temp + s.charAt(i);

        }
        return rev.trim();
    }
}