// Question Link: https://leetcode.com/problems/maximum-subarray/description/
/*
Approach: 
In Kadane's Algorithm, we look for all positive contiguous subarrays of the array, keeping track of the global maximum sum which will be the array. 
Whenever we get a positive-subarray-sum, we compare it with the global_max and update global_max if the sum is greater than the global_max, and 
whenever we get a negative-subarray-sum, we have to reset the sum to zero, because we will never take that element for the next subarrays.
The above algorithm will fail for the case, when there are only negative elements in the array, because our global_max is already set to 0. 
So, to handle that case we have to modify our algorithm. We will add current element to the previous subarray only if it results in a greater sum, 
else we will start the new subarray from that element. 
*/
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = -99999;
        int currentSum = 0;
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(num < num+currentSum){
                currentSum += num;
            } else {
                currentSum = num;
            }

            if(currentSum>maxSum){
                maxSum = currentSum;
            }
        }

        return maxSum;
    }
}
