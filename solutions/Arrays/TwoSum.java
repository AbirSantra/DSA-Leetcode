// Question Link: https://leetcode.com/problems/two-sum/

/* 
Approach:
We will keep a track of the elements encountered and their indexes in a map.
For each element, we will check if the difference from the target exists in the map.
If it does, we return the indexes. Else, we add it to the map.
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        int[] ans = new int[2];

        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];

            if(map.containsKey(diff)){
                ans[0] = map.get(diff);
                ans[1] = i;
                return ans;
            } else {
                map.put(nums[i],i);
            }
        }

        return ans;
    }
}
