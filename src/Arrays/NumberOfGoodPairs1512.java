package Arrays;
//Question: https://leetcode.com/problems/number-of-good-pairs/
public class NumberOfGoodPairs1512 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,1};
        System.out.println(numIdenticalPairs(nums));
    }
    public static int numIdenticalPairs(int[] nums){
        int ans=0;
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]) ans++;
            }
        }
        return ans;
    }
}
