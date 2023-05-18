// Question Link: https://leetcode.com/problems/transpose-matrix/description/
/* 
Approach:
The transpose of the matrix is basically just the positions of
the rows and the columns flipped in the original matrix.
So mat[i][j] becomes mat[j][i].
*/

class Solution {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] transpose = new int[col][row];
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                transpose[i][j] = matrix[j][i];
            }
        }

        return transpose;
    }
}
