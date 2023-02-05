// Question Link: https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

/* We need to do a simple binary search. We need to return a letter that is greater than target. 
So once we find mid, if mid is less than or equal to the target, we reduce our search space to the right hand side. 
Else if mid is more than the target we reduce our search space to the left hand side. When the loop breaks, 
start will point to the letter greater than target and end will point to the letter smaller than target. 
We need the greatest number smaller than target we return start. 
However, target is the last element of the array, then start would be out of bounds of the array. So we will return start%length. 
This will wrap the index around to 0. */

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int len = letters.length;
        int start = 0;
        int end = letters.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(letters[mid] <= target){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[start%len];
    }
}