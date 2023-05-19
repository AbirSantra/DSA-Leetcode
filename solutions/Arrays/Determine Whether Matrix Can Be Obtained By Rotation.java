// Question Link: https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/description/
/* 
Approach:
Since there are only 4 possible 90-degree increments, (0, 90, 180, 360)
We simply need to run the algo 4 times and return if any case is true.
Each time, we will rotate the array and then check if it is equal to the target.
*/

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean ans = false;
        int n = mat.length;
        for(int i=0;i<4;i++){
            mat = rotateMat(mat,n);
            if(isEqualMat(mat,target,n)){
                return true;
            }
        }
        return ans;
    }

    public static int[][] rotateMat(int[][] mat, int n){
        int[][] temp = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                temp[i][j] = mat[n-j-1][i];
            }
        }

        return temp;
    }

    public static boolean isEqualMat(int[][] mat, int[][] target, int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=target[i][j]){
                    return false;
                }
            }
        }

        return true;
    }
}
