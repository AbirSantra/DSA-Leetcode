// Question Link: https://leetcode.com/problems/create-target-array-in-the-given-order/description/
/* 
Approach:
We simply take advantage of the add method of Arraylist which can add an element in a specified position 
by shifting all the elements instead of replacing the element in that position.
After adding all the elements at the specified positions,
we store the final result in an array and return.
*/
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] ans = new int[nums.length];
        List<Integer> arr = new ArrayList<Integer>();

        for(int i=0;i<nums.length;i++){
            arr.add(index[i],nums[i]);
        }

        for(int i=0;i<ans.length;i++){
            ans[i] = arr.get(i);
        }

        return ans;
    }
}
