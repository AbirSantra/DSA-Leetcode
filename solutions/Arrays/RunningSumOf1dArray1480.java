package Arrays;
//Question: https://leetcode.com/problems/running-sum-of-1d-array/

import java.util.Arrays;

public class RunningSumOf1dArray1480 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,1,1};
        System.out.println(Arrays.toString(runningSum(nums)));

    }
    public static int[] runningSum(int[] nums){
        int[] ans = new int[nums.length];
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            ans[i] = sum;
        }
        return ans;
    }
}
