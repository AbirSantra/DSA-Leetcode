package Arrays;
//Question: https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
public class CellsWithOddValuesInAMatrix1252 {
    public static void main(String[] args) {
        int[][] indices = new int[][]{
                {1,1},
                {0,0}
        };
        System.out.println(oddCells(2,2,indices));
    }
    public static int oddCells(int m, int n, int[][] indices){
        int ans = 0;
        int[][] mat = new int[m][n];
        for(int i=0;i< indices.length;i++){
            int row = indices[i][0];
            int col = indices[i][1];
            updateRow(mat,row,n);
            updateCol(mat,col,m);
        }
        for(int i=0;i< m;i++){
            for (int j=0;j<n;j++){
                if(mat[i][j]%2!=0) ans++;
            }
        }
        return ans;
    }
    public static void updateRow(int[][] arr,int row,int n){
        for(int i=0;i<n;i++){
            arr[row][i]++;
        }
    }
    public static void updateCol(int[][] arr,int col,int m){
        for(int i=0;i<m;i++){
            arr[i][col]++;
        }
    }
}
