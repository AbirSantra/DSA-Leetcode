class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            // get the expected result which will add upto target 
            int diff = target - nums[i];
            
            //check if result is present in the map
            if(!map.containsKey(diff)){
                // if not add the element to the map as the key and its position as the value
                map.put(nums[i],i);
            } else {
                // if present then we have found the answer, return the position of the key and the current element
                ans[0] = map.get(diff); //
                ans[1] = i;
            }
        }
        return ans;
    }
}
