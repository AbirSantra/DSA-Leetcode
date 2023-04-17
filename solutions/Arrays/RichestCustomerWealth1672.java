// Question: https://leetcode.com/problems/richest-customer-wealth/
/* 
Approach: We traverse throught the array and get the sum of array in the array. 
Then we compare it with the max. If sum is greater than max, we replace max with sum.
 */

class Solution {
    public static int arraySum(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }

        return sum;
    }

    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i=0;i<accounts.length;i++){
            int sum = arraySum(accounts[i]);
            max = Math.max(sum,max);
        }

        return max;
    }
}
