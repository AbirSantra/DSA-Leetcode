class Solution {
    public static boolean findRotation(int[][] mat, int[][] target){
        boolean ans = false;
        for (int i=0;i<4;i++){
            mat = rotateMat(mat);
            if (isEqual(mat,target)){
                ans = true;
                break;
            }
        }
        return ans;
    }
    public static boolean isEqual(int[][] mat,int[][] target){
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat.length;j++){
                if (mat[i][j]!=target[i][j]) return false;
            }
        }
        return true;
    }
    public static int[][] rotateMat(int[][] mat){
        int[][] ans = new int[mat.length][mat.length];
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat.length;j++){
                ans[i][j] = mat[mat.length-j-1][i];
            }
        }
        return ans;
    }
}
