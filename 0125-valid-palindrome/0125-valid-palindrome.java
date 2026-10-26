class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
         for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                sb.append((char) (ch + 32));
            } else if (ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') {
                sb.append(ch);
            }
        }
        String original = sb.toString();
        String reversed = sb.reverse().toString();
        return original.equals(reversed);
    }
}