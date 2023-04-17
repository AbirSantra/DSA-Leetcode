// Question Link : https://leetcode.com/problems/shuffle-the-array/
/* 
Approach: We store the pair of numbers in the second half of the array. 
Since the limit of numbers is 10^3, we multiply the second half by 10^4 and then add it corresponding element from the first half of the array. 
This way we have both the original numbers and its corresponding number in the same element. 
To get the original number, we divide the element by 10^4 and take the quotient and to get the corresponding number 
from the first half, we take the remainder. Now we take a pointer to keep track of the position. We traverse the second half 
of the array and we replace the element at our pointer position with the remainder and the element next to the pointer with the quotient.
*/
class Solution {
    public int[] shuffle(int[] nums, int n) {
        for(int i=n;i<nums.length;i++){
            nums[i] = nums[i] * 10000 + nums[i - n];
        }

        int pos = 0;
        for(int i=n; i<nums.length; i++){
            nums[pos] = nums[i] % 10000;
            nums[pos + 1] = nums[i] / 10000;
            pos+=2;
        }

        return nums;
    }
}
