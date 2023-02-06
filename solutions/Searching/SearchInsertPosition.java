// Question Link: https://leetcode.com/problems/search-insert-position/description/

/* Approach : The first part of the question is a simple binary search. 
We just search for the target and return if it is found. 
But instead of returning -1 when not found we return the start pointer since when the loop breaks, 
the start pointer will be in the position where the target should have been */

class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            int num = nums[mid];
            if(num == target){
                return mid;
            } else if(num > target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        } 

        return start;
    }
}