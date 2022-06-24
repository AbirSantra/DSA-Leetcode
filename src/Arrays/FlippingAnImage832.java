package Arrays;

import java.util.Arrays;

//Question: https://leetcode.com/problems/flipping-an-image/
public class FlippingAnImage832 {
    public static void main(String[] args) {
        int[][] image = new int[][]{
                {1,1,0,0},
                {1,0,0,1},
                {0,1,1,1},
                {1,0,1,0}
        };
        int[][] ans = flipAndInvertImage(image);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans.length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] flipAndInvertImage(int[][] image){
        int[][] ans = new int[image.length][image.length];
        for(int i=0;i< image.length;i++){
            image[i] = flipArr(image[i]);
            image[i] = invertArr(image[i]);
        }
        return image;
    }
    public static int[] flipArr(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public static int[] invertArr(int[] arr){
        for(int i=0;i< arr.length;i++){
            if(arr[i]==1) arr[i] =0 ;
            else arr[i] = 1;
        }
        return arr;
    }
}
