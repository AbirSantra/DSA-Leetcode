// Question Link: https://leetcode.com/problems/build-array-from-permutation/
/* O(n) Approach */
/* class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[nums[i]];
        }

        return nums;
    }
} */
/* 
 Optimized O(1) Approach
 The idea is to store both the original number as well as the target number in the same place.
 This can be done by replace all the numbers by using the formula a+bn where a is the original number nums[i],
 b is the target number nums[nums[i]] and n is the length of the array.
 Then the original number can be retrieved by nums[i]%n
 And the target number can be retrieved by nums[i]/n 
*/
class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            nums[i] = nums[i] + n * (nums[nums[i]]%n);
        }

        for(int i=0;i<n;i++){
            nums[i] = nums[i] / n;
        }

        return nums;
    }
}
