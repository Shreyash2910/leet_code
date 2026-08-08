class Solution {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        int count=1;
        char ch= word.charAt(0);

        for(int i=0; i<word.length();i++){
            if(i!=word.length()-1 && word.charAt(i)==word.charAt(i+1)){
                if(count==9){
                    sb.append(count);
                    sb.append(word.charAt(i)) ;
                    count=1;
                    continue;
                }
                count++;
            }
            else{
                sb.append(count);
                sb.append(word.charAt(i)) ;
                count=1;
            }
        }
        return sb.toString();
    }
}