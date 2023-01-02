// We traverse the array in the 4 directions, i.e, left-to-right, top-to-bottom, right-to-left, and bottom-to-top. For each movement, we place the integers, move inwards, start the next movement.

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int num = 1;
        int direction = 1;
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        while(left<=right && top<=bottom){
            if(direction == 1){
                // traverse from left to right
                for(int i=left;i<=right;i++){
                    ans[top][i] = num++;
                }
                top++;
                direction = 2;
            } else if(direction == 2){
                // traverse from top to bottom
                for(int i=top;i<=bottom;i++){
                    ans[i][right] = num++;
                }
                right--;
                direction = 3;
            } else if(direction == 3){
                // traverse from right to left
                for(int i=right;i>=left;i--){
                    ans[bottom][i] = num++;
                }
                bottom--;
                direction = 4;
            } else if(direction == 4){
                // traverse from bottom to top
                for(int i=bottom;i>=top;i--){
                    ans[i][left] = num++;
                }
                left++;
                direction = 1;
            }
        }

        return ans;
    }
}