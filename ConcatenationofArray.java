//Big-O ignores constants, because the doubling test only sees the shape.
// When n doubles, the loop count (2n iterations) doubles,
// and so does the output array. Both are linear.
// Time O(n): one pass over 2n slots, constant work each.
// Space O(n): the 2n-int output array (O(1) extra beyond it).
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        for(int i=0;i<ans.length;i++) {
            if(i<nums.length) ans[i]=nums[i];
            else ans[i]=nums[i-nums.length];
        }
        return ans;
    }
}