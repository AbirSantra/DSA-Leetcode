package Arrays;

import java.util.Arrays;

//Question: https://leetcode.com/problems/shuffle-the-array/
public class ShuffleTheArray1470 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(nums,nums.length/2)));
    }
    public static int[] shuffle(int[] nums, int n){
        int[] ans = new int[nums.length];
        int j=0;
        for (int i=0;i<n;i++){
            ans[j] =  nums[i];
            j++;
            ans[j] = nums[i+n];
            j++;
        }
        return ans;
    }
}
