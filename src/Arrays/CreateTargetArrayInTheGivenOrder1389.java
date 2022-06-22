package Arrays;

import java.util.Arrays;

//Question: https://leetcode.com/problems/create-target-array-in-the-given-order/
public class CreateTargetArrayInTheGivenOrder1389 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,0};
        int[] index = new int[]{0,1,2,3,0};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
    public static int[] createTargetArray(int[] nums,int[] index){
        int[] ans = new int[nums.length];
        for (int i=0;i< nums.length;i++){
            insertNum(ans,nums[i],index[i]);
        }
        return ans;
    }
    public static void insertNum(int[] ans,int target,int index){
        for (int i=ans.length-2;i>=index;i--){
            ans[i+1] =  ans[i];
        }
        ans[index]=target;
    }
}
