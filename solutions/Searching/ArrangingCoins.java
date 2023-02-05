// Question Link: https://leetcode.com/problems/arranging-coins/

/* Binary Search Approach: We know that the sum upto n numbers is given by n*(n+1)/2 
So we start at 1, end at n and find the mid. Now we check if sum upto mid (i.e the number of 
coins used upto mid) is equal to the number of coins provided to us. If it is equal, then we 
have found our answer. Else if the number of coins used is more than n, then we have used 
more than our limit, so we search in the left half. Else if the number of coins if less
than our limit, then we have found a probable answer. However better answers might lie
in the right hand side. So we search in the right hand side. When the loop breaks, that means 
the last row was incomplete. At this point, the start pointer will lie on the incomplete row number 
and the end pointer will lie of the last completed row number. So we return end.
 */
class Solution {
    public int arrangeCoins(int n) {
        long start = 1;
        long end = n;

        while(start<=end){
            long mid = start + (end - start) / 2;
            long coinsReq = mid * (mid + 1) / 2;

            if(coinsReq == n){
                return (int)mid;
            } else if(coinsReq > n){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return (int)end;
    }
}