// Question Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
/* 
Approach:
We are simply going to traverse the array and maintain a pointer starting from 0.
Each time the element at the current index is not equal to the next element,
we replace the element at the pointer with the current element and increment the pointer by 1.
After the loop ends, we replace the element at the pointer with the last element.
This is done because the loop will run till before the last element,
and the last element might be a unique element.
At the end, we return the pointer.
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int ptr = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[ptr] = nums[i];
                ptr++;
            }
        }

        nums[ptr++] = nums[nums.length-1];
        return ptr;
    }
}
