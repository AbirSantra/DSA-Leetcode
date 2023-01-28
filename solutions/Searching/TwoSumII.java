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

// BETTER SOLUTION
/**
Two Pointer Intuition: We start by considering the elements at the extreme ends (that is, the smallest element and the largest element). Now if the sum of these two elements is equal to the target, we have found our answer. But, if the sum of these two elements is more than the target, we need to reduce our sum. So we have to consider the next largest element, i.e, we move the end-pointer one step inwards. However, if the sum is less than the target, then we need to try and increase the sum. So we have to consider the next smallest element, i.e we move the start-pointer one step inwards. Eventually, we will find our answer.
*/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[]{-1,-1};
        int start = 0;
        int end = numbers.length - 1;

        while(start < end){
            int sum = numbers[start] + numbers[end];

            if(sum == target){
                ans[0] = start + 1;
                ans[1] = end + 1;
                break;
            } else if(sum > target){
                end--;
            } else {
                start++;
            }
        }

        return ans;
    }
}
