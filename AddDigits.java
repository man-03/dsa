class Solution {
    //time O(logn) space O(1)
    // public int addDigits(int num) {
    //     while(num>=10) {
    //         num = num/10 + num%10;
    //     }
    //     return num;
    // }

    //time O(logn) space O(logn) runtime 1ms
    public int addDigits(int num) {
        if(num<=9) return num;
        else return addDigits(num/10 + num%10);
    }

    //time O(1) spaceO(1) runtime 2ms
    // public int addDigits(int num) {
    //     if(num>9) return num%9 == 0? 9: num%9; else return num;
    // }
}
