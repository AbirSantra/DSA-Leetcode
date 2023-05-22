// Question Link: https://leetcode.com/problems/plus-one/

/* 
Approach: 
We start from right to left, emulating a mathematical edition.
We will think of 1 as a carry.
For each digit, we add 1.
If the sum is 9 or less, we simply replace that digit with the sum,
and return the array since all other digits will remain the same.
Else, if the sum become 10, we simply replace the digit with 0,
and move to the next iteration.
If, after traversing the entire array, the carry still remains, we simply
create a new array of N+1 size and the set the first element as 1.
So, if the number is 999, then after traversing, the array will become 000
and would be yet to be returned. So we create an array of size 4, which is 0000,
and then set the first element to be 1. So we get 1000 which is the answer.
*/

class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            int sum = digits[i] + 1;
            if(sum < 10){
                digits[i] = sum;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        int[] newDigits = new int[digits.length+1];
        newDigits[0] = 1;
        return newDigits;
    }
}
