// Question Link: https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/

/* 
Approach: Since each array is sorted, we apply binary search. For each array in the matrix, we apply binary search 
which will return the number of negative numbers in the array. We add those up to find the final answer.
Modified Binary Search: If we can find the first negative element, then all other elements after that will also be negative. 
So we can find the number of negative elements in the array by simply subtracting the position of the first negative element 
from the length of the array. So after we find mid, we check to see if it is negative. If yes, then we have found a probable answer, 
but their maybe other negative elements before it. So we search in the left side of the array. Else, we search in the right side. 
When the loop breaks, we will have our answer.
Time Complexity: O(n log n)
*/

class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i=0;i<grid.length;i++){
            int k = revBinSearch(grid[i]);
            count += k; 
        }
        return count;
    }

    static int revBinSearch(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        if(arr[start] < 0){
            return arr.length;
        }
        int ans = 0;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] < 0){
                ans = arr.length - mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
        
    }
}