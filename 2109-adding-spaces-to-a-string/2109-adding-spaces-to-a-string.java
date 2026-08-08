class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder result= new StringBuilder();
        int start=0;
        for(int i=0; i<spaces.length; i++){
            result.append(s.substring(start,spaces[i]));
            start=spaces[i];
            result.append(" ");
            if(i==spaces.length-1)
                result.append(s.substring(start,s.length()));
        }
        return result.toString();
    }
}