// Question Link: https://leetcode.com/problems/kth-missing-positive-number/

/* Approach: If we assume there are no missing numbers, then we can say that for every position i in the array, 
the value should be i+1 (since the array starts from value 1). Since, the array is strictly increasing, 
we apply binary search. We find mid. Then the value at mid should be (mid+1), but if there are missing numbers 
then the value would be more than (mid+1). So we find out how many numbers are missing before mid by using 
the difference of what the value is and what the value should have been, that is, arr[mid] - (1+mid). 
If this no. of missing numbers if less the k, then we need more missing numbers so we search on the right hand side. 
Else if it is more than k, then we need less missing numbers so we search on the left hand side. 
Even the loop breaks, our start pointer will be pointing at where the kth missing number should have been.
But since k numbers are missing, the kth missing number will be given by start + k */

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] - (1+mid) < k){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start + k;
    }
}