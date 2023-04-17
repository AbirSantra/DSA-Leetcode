// Question Link: https://leetcode.com/problems/running-sum-of-1d-array/
/* 
Approach: We maintain the running sum in a variable. 
For each element, we add to the running sum, then replace the element by the running sum. 
This way we dont need to create another array for storing the answer.
*/
class Solution {
    public int[] runningSum(int[] nums) {
        int rSum = 0;
        for(int i=0;i<nums.length;i++){
            rSum = rSum + nums[i];
            nums[i] = rSum;
        }
        return nums;
    }
}
