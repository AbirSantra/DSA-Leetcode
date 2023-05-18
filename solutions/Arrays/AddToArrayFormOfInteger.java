// Question Link: https://leetcode.com/problems/add-to-array-form-of-integer/
/* 
Approach:
We emulate the mathematical addition procedure.
So for every digits from the right hand side, we add k
Then we take the last digit from the result of the addition and put it into our answer.
Then we reduce k.
If k still remains after all digits have been covered, 
we keep adding the remaining digits of k in the answer.
*/

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<Integer>();

        for(int i=num.length-1;i>=0;i--){
            int sum = k + num[i];
            ans.add(0,sum%10);
            k = sum/10;
        }

        while(k>0){
            ans.add(0,k%10);
            k = k / 10;
        }

        return ans;
    }
}
