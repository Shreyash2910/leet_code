class Solution {
    public int addDigits(int num) {
        while(num>9){
            num= 1 + ((num - 1) % 9);
        }
        return num;
    }
}