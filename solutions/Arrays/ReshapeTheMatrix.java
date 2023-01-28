class Solution {
    public int[][] matrixReshape(int[][] matrix, int r, int c) {
        if(matrix.length*matrix[0].length != r*c){
            return matrix;
        } else {
            int[][] ans = new int[r][c];
            int rp = 0, cp = 0; // row and column pointers for the ans array
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[i].length;j++){
                    ans[rp][cp] = matrix[i][j];
                    if(cp == c-1){ // if the col pointer has reached the last column, reset to 0 and increase row pointer
                        rp++;
                        cp = 0;
                    } else { // if the col pointer has no reached the last column, increase the column pointer
                        cp++;
                    }
                }
            }
            return ans;
        }
    }
}
