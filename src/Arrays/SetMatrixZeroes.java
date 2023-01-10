// If a particular element is 0, store its row and col number in a set. These rows and cols need to be filled with 0. Iterate through the matrix, and if the row or the col of an element is contained in one of the sets, make the element zero.

class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rowSet = new HashSet<Integer>();
        Set<Integer> colSet = new HashSet<Integer>();

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(rowSet.contains(i) || colSet.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
