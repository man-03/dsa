// Time O(n): one pass, stops early at the first 0. Space O(1): two int locals.
//Auxiliary space doesn’t count the input array at all.
// It’s O(1) because the only memory you allocate is two int locals (count, i),
// and that doesn’t change when n grows.
class Solution {
    public int arraySign(int[] nums) {
        int count=0;
        for (int i: nums) {
            if(i==0) return 0;
            if(i<0) count++;
        }
        return count % 2 == 0 ? 1 : -1;
    }
}


// Approach 1: Direct multiplication
// Multiply all array elements and pass the result to signFunc().
//
// Why not use this?
// Integer and long multiplication can overflow for large inputs.
// We only need the sign of the product, not its actual value.
// Sometimes calculating an intermediate result is unnecessary.
/*
class Solution {
    public int arraySign(int[] nums) {
        long x=1;
        for (int i=0; i<nums.length; i++) {
            x*=nums[i];
        }
        return signFunc(x);
    }
    public int signFunc(long x) {
        if(x>0) return 1;
        else if(x<0) return -1;
        else return 0;
    }
}
*/
