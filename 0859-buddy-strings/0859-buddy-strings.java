class Solution {
    public boolean buddyStrings(String s, String goal) {
        HashSet<Character> set= new HashSet<>();
        if(s.length() != goal.length())
            return false;
        
        if(s.equals(goal)){
            for(char ch: s.toCharArray()){
            set.add(ch);
            }
            return s.length()>set.size();
        }
        List<Integer> notequal = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                notequal.add(i);
            }
        }
        if(notequal.size()!=2)
            return false;
        int i= notequal.get(0);
        int j= notequal.get(1);
        if(s.charAt(i) == goal.charAt(j) && s.charAt(j) == goal.charAt(i))
            return true;
        return false;
    }
}