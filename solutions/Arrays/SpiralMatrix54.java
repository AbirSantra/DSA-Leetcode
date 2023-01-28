// We have 4 types of movements here -> left-to-right, top-to-bottom, right-to-left, bottom-to-top. We do each movement starting with the left to right movement. For each movement, we complete the traversal, and then move pointers inwards and start the next movement.

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        int direction = 1;

        while(top<=bottom && left<=right){
            if(direction == 1){
                // traverse from left to right
                for(int i=left;i<=right;i++){
                    ans.add(matrix[top][i]);
                }
                top++;
                direction = 2;
            } else if(direction == 2){
                // traverse from top to bottom
                for(int i=top;i<=bottom;i++){
                    ans.add(matrix[i][right]);
                }
                right--;
                direction = 3;
            } else if(direction == 3){
                // traverse from right to left
                for(int i=right;i>=left;i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
                direction = 4;
            } else if(direction == 4){
                // traverse from bottom  to top
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
                direction = 1;
            }
        }

        return ans;
    }
}