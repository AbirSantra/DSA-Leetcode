// Question Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
/* 
Approach:
For every element of the array, we will use a simple math formula which will
give us the no. of digits in that number. If that is even, we increment the counter.
*/

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int digits = (int)Math.log10(nums[i]) + 1;
            if(digits%2==0){
                count++;
            }
        }

        return count;
    }
}
