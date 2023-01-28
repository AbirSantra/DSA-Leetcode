package Arrays;
//Question: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber1365 {
    public static void main(String[] args) {
        int[] nums = new int[]{6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    //BRUTE FORCE APPROACH
//    public static int[] smallerNumbersThanCurrent(int[] nums){
//        int[] ans = new int[nums.length];
//        for (int i=0;i< nums.length;i++){
//            int count = 0;
//            for (int j=0;j<nums.length;j++){
//                if(i!=j && nums[i]>nums[j]) count++;
//            }
//            ans[i]=count;
//        }
//        return ans;
//    }


    //OPTIMIZED APPROACH
    //First we store the frequency of each character in an array.
    //Then we store the running sum of the previous array in another. This gives us the no of numbers smaller than the current number at a point
    //Then we check for each character in the nums array in the runningsum array and return the no. of numbers smaller from the runningsum array.

    public static int[] smallerNumbersThanCurrent(int[] nums){
        int[] ans = new int[nums.length];
        int[] count = new int[101];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        int[] rsum = new int[101];
        int sum = 0;
        for(int i=0;i<count.length;i++){
            sum+=count[i];
            rsum[i]=sum;
        }
        for (int i=0;i<nums.length;i++){
            if(nums[i]==0){
                ans[i] = 0;
            } else {
                ans[i] = rsum[nums[i]-1];
            }
        }
        return ans;
    }

}
