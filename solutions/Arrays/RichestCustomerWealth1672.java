package Arrays;
//Question: https://leetcode.com/problems/richest-customer-wealth/

public class RichestCustomerWealth1672 {
    public static void main(String[] args) {
        int[][] account = new int[][]{{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(account));
    }
    public static int maximumWealth(int[][] accounts){
        int ans =0;
        for(int i=0;i< accounts.length;i++){
            int sum =0;
            for(int j=0;j<accounts[i].length;j++){
                sum = sum + accounts[i][j];
            }
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}
