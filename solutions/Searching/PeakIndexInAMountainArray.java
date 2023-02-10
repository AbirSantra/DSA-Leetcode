// Question Link: https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

/* 
Approach:
We need to find the position where the array starts decreasing. Since the arrray is somewhat sorted, we can use binary search. 
When we find the mid element, we check to see if the next element is smaller than the middle element. 
This would mean that we are in the descending part of the array. 
So mid might be a possible answer, however an even greater element might lie to the left of mid. 
So we reduce our search space to the left side of mid and search again. 
When the loop breaks, the last mid which satisfied the condition will be the answer.
*/

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int ans = 0;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]){
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}