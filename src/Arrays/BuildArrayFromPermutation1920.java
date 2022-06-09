package Arrays;
//Question: https://leetcode.com/problems/build-array-from-permutation/

import java.util.Arrays;

public class BuildArrayFromPermutation1920 {
    public static void main(String[] args) {
        int[] nums = new int[]{5,0,1,2,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }

    public static int[] buildArray(int[] nums){
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
