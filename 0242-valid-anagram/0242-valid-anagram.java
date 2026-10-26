class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<=s.length()-1;i++){
            char ch = s.charAt(i);
            if (map.containsKey(ch)){
                int current = map.get(ch);
                map.put(ch, current + 1);
            }
            else {
                map.put(ch,1);
            }
        }
        for(int i=0;i<=t.length()-1;i++){
            char ch = t.charAt(i);
            if (map.containsKey(ch)){
                int current = map.get(ch);
                map.put(ch, current -1);
            }
            else {
                return false;
            }
        }
        for (Integer value : map.values()) {
            if (value != 0) {
                return false;
            }
        }
        return true; 
    }
}
