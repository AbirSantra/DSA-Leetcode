package Arrays;
//https://leetcode.com/problems/concatenation-of-array/

import java.util.Arrays;

public class ConcatenationOfArray1929 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums){
        int[] ans = new int[nums.length*2];
        for (int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }
        return ans;
    }
}
