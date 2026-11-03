// Time O(n·m): n customers, one addition per bank. Space O(1): four int locals.
//time is O(m.n) as m doubles one for loop or one operation(m times), as n doubles one forloop of n  times, space O(1)
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for (int i=0; i<accounts.length; i++) {
            int sum=0;
            for(int j=0; j<accounts[i].length; j++) {
                sum=sum+accounts[i][j];
            }
            if(max<sum) max = sum;
        }
        return max;
    }
}