// Question Link : https://leetcode.com/problems/flipping-an-image/description/
/* 
Approach:
Let us consider an array [1,1,0,1].
We can see that the array when flipped will be [1,0,1,1],
and then inverted will be [0,1,0,0].
We can find a pattern here: If the elements on the opposite ends are the same, 
then the result has them inverted. If they are different, the result is the same as original array.
So we maintain two pointers, one at the begining element and another at the last element
and move inwards. Each time we check if the elements at the pointers are equal.
If they are then we invert them. Else we continue.
At the end, we return the original arrays.
*/
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int low = 0;
            int high = image[i].length - 1;

            while(low<=high){
                if(image[i][low]==image[i][high]){
                    image[i][low] = 1 - image[i][low];
                    image[i][high] = image[i][low];
                }
                low++;
                high--;
            }
        }

        return image;
    }
}
