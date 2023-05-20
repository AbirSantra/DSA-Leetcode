// Question Link: https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/
/* 
Approach:
We are going to utilize HashSets since we are dealing with unique elements.
First, we are going to check the rows, find the min in each, and then add it to the set.
Next, we are going to check the columns, find the max in each, and then check
if it also exists in the min set. If yes, then it is a lucky number.
Important point to note is that every number is unique and there are no repetitions.
*/

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        HashSet<Integer> minSet = new HashSet<Integer>();
        List<Integer> ans = new ArrayList<Integer>();

        for(int i=0;i<matrix.length;i++){
            int min = matrix[i][0];
            for(int j=0;j<matrix[i].length;j++){
                min = Math.min(min,matrix[i][j]);
            }
            minSet.add(min);
        }

        for(int i=0;i<matrix[0].length;i++){
            int max = matrix[0][i];
            for(int j=0;j<matrix.length;j++){
                max = Math.max(max,matrix[j][i]);
            }
            if(minSet.contains(max)){
                ans.add(max);
            }
        }

        return ans;
    }
}
