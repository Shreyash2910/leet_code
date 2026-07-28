class Solution {
    public int compress(char[] chars) {
        StringBuilder sb= new StringBuilder();
        char ch=chars[0];
        int count=1;
        sb.append(ch);
        for(int i=1 ;i<chars.length;i++){
            if(chars[i]==ch){
                count++;
            }
            else{
                if(count>1)
                    sb.append(count);
                ch=chars[i];
                sb.append(ch);
                count=1;
            }
        }
        if(count>1)
            sb.append(count);
        for (int i =0; i<sb.length();i++) {
            chars[i] = sb.charAt(i);
        }
        return sb.length(); 
    }
}