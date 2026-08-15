class Solution {
    public int addDigits(int num) {
        int x=0;
        while(num>9){
            num= 1 + ((num - 1) % 9);
        }
        return num;
    }
}