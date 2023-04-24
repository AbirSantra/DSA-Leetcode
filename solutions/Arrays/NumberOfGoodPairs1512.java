// Question Link: https://leetcode.com/problems/number-of-good-pairs/description/

/* 
Approach: We will use a hashmap to store the frequency of each number. 
If a number hasnt occurred before, we set its frequency to 1. If it has occurred, we get the
number of times that it has occurred. Then we add this frequency to the current answer since the
current number will make a good pair with each of the previous occurrence.
At the end we return the count answer.
*/

class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int prevFreq = map.get(nums[i]);
                count += prevFreq;
                map.put(nums[i],prevFreq+1);
            } else {
                map.put(nums[i],1);
            }
        }

        return count;
    }
}
