class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int head = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack[head++] = c; 
            } else {
                if (head == 0) return false; 
                char open = stack[--head]; 
                if ((c == ')' && open != '(') || 
                    (c == '}' && open != '{') || 
                    (c == ']' && open != '[')) {
                    return false;
                }
            }
        }
        return head == 0;
    }
}
