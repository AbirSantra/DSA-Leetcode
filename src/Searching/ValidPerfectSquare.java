// Question Link: https://leetcode.com/problems/valid-perfect-square/
// We simply need to perform a binary search of elements from 1 to n. Each time we find mid element, we check if its square is equal to our target (given number), 
// if yes, then we have found our answer and we return true. If the square of mid is more than our target, we need to search in the left hand side, else if the 
// square of mid is less than our target, we need to search in the right hand side. If no element squares up to the target, we return false.
// Note: We need to use long data type here to avoid integer overflow when doing mid*mid for very large numbers

class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1){
            return true;
        }

        long start = 1;
        long end = num/2;

        while(start<=end){
            long mid = start + (end - start)/2;

            if(mid*mid == num){
                return true;
            } else if(mid*mid > num){
                end = mid - 1;
            } else if(mid*mid < num) {
                start = mid + 1;
            }
        }

        return false;
    }
}
