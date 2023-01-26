// Question Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
/**
Binary Search Intuition: For every element in the array, we find to 'search' for another in element in the array which adds upto to the target element. So, we have numbers[i] and we need to 'search' and find if (target - numbers[i]) exists in the array. Since the array is sorted, we can use binary search. Also, since it is stated that there is exactly one solution for any array, we can stop the loop after we have found the answer. Point to remember: Answer must be returned as one-indexed (arrays are zero-indexed) as given in the examples. So we must add 1 to our answer.
*/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[]{-1,-1};

        for(int i=0;i<numbers.length;i++){
            int searchResult = binSearch(numbers,i+1,numbers.length-1,target-numbers[i]);
            if(searchResult != -1){
                ans[0] = i+1;
                ans[1] = searchResult+1;
                break;
            }
        }

        return ans;
    }

    // simple binary search helper function
    static int binSearch(int[] nums, int start, int end, int key){

        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid] == key){
                return mid;
            } else if(nums[mid]>key){
                end = mid - 1;
            } else if(nums[mid]<key){
                start = mid + 1;
            }
        }

        return -1;
    }
}
