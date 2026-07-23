class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] data = s.split(" ");
        if (pattern.length() != data.length) {
            return false;
        }
        HashMap<Character,String> st=new HashMap<>();
        HashMap<String,Character> revst=new HashMap<>();
        for(int i =0; i<data.length;i++){
            char ch = pattern.charAt(i);
            if(st.containsKey(ch)){
                if (!st.get(ch).equals(data[i])){
                    return false;
                }
            }
            else{
                st.put(ch, data[i]);
            }
            if(revst.containsKey(data[i])){
                if(revst.get(data[i]) != ch)
                    return false;
            }
            else{
                revst.put(data[i],ch);
            }
        }
        return true;
    }
}