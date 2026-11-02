//Mathematical approach
//Time O(n·d): n numbers, one division per digit.
/* Space O(1): any element of any no. of digits use only four int locals
will not create a new memory. */
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i=0; i<nums.length; i++) {
            int a = nums[i];
            int digits = 0;
            do {
                a/=10;
                digits++;
            } while(a != 0);
            if(digits%2==0) {
                count++;
            }
        }
        return count;
    }
}

// String approach

//Time O(n·d): n numbers, one String built per number.
// Space O(d): one temporary String live at a time.
/*
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i=0; i<nums.length; i++) {
            if(String.valueOf(nums[i]).length()%2==0) {
                ++count;
            }
        }
        return count;
    }
}
*/
