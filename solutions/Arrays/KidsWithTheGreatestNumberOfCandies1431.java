// Question Link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
/* 
Approach: 
We find the max element in the array.
Then we traverse through the array and for each element,
we add the extraCandies and see if the sum is more then or equal to max.
If true, then we add true to the ans arraylist,
Else, we add false to the ans arraylist
 */

class Solution {
    public static int findMax(int[] candies){
        int max = 0;
        for(int i=0;i<candies.length;i++){
            max = Math.max(max,candies[i]);
        }

        return max;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<Boolean>();
        int max = findMax(candies);
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies >= max){
                ans.add(true);
            } else {
                ans.add(false);
            }
        }

        return ans;
    }
}
