class Solution {
    public static List<Integer> luckyNumbers(int[][] matrix){
        List<Integer> ans = new ArrayList<>();
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if(isMaxCol(matrix[i][j],matrix,j) && isMaxRow(matrix[i][j],matrix,i)){
                    ans.add(matrix[i][j]);
                }
            }
        }
        return ans;
    }

    public static boolean isMaxCol(int target,int[][] matrix,int col){
        for (int i=0;i< matrix.length;i++){
            if(matrix[i][col]>target) return false;
        }
        return true;
    }

    public static boolean isMaxRow(int target,int[][] matrix,int row){
        for (int i=0;i< matrix[0].length;i++){
            if(matrix[row][i]<target) return false;
        }
        return true;
    }
}   
