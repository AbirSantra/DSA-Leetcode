// Question Link: https://leetcode.com/problems/matrix-diagonal-sum/

/* 
Approach: 
Here we must remember the pattern for diagonal elements.
For the left diagonal, all elements will have row==col
For the right diagoanl, all element will have col = length - row
Check for these conditions and add the elements.
*/

/* 
O(n^2) Solution
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i==j || j==(mat.length-i-1)){
                    sum+=mat[i][j];
                }
            }
        }

        return sum;
    }
} 
*/

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int mid = (mat.length)/2;
        for(int i=0;i<mat.length;i++){
            sum+= mat[i][i];
            sum+= mat[i][mat.length-i-1];
        }

        if(mat.length%2!=0){
            sum = sum - mat[mid][mid];
        }
        return sum;
    }
}
