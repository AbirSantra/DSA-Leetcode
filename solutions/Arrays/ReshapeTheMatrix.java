// Question Link: https://leetcode.com/problems/reshape-the-matrix/description/
/*
Approach:
We will traverse the original matrix and put element in the newly formed matrix.
But we will use a row and col pointer for addressing the new matrix.
We will add elements by incrementing the col pointer for a row.
Once a row is finished, we will increment the pointer to the next row. 
*/

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if(m*n != r*c){
            return mat;
        } else {
            int rp = 0;
            int cp = 0;
            int[][] ans = new int[r][c];

            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    ans[rp][cp] = mat[i][j];

                    if(cp < c-1){
                        cp++;
                    } else {
                        cp = 0;
                        rp++;
                    }
                }
            }

            return ans;
        }
    }
}
