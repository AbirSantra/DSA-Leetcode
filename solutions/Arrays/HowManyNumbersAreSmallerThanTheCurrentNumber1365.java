//Question Link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
/* 
Approach: 
First we find out the frequency of occurence of each character.
Then we calculate a running sum of this frequency array.
Now the rSum at each position is equal to the total number of elements that have occurred before it
as well as the element itself.
Since we need only elements smaller than the current element,
we return the rSum of the element before it.
 */
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freq = new int[101];
        int[] rSum = new int[101];
        int[] ans = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }

        int sum = 0;
        for(int i=0;i<freq.length;i++){
            sum = sum + freq[i];
            rSum[i] = sum;
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                ans[i] = 0;
            } else {
                ans[i] = rSum[nums[i]-1];
            }
        }

        return ans;
    }
}
