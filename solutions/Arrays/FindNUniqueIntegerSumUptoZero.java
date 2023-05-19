//Question Link: https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
/* 
Approach:
We simply add the positives and the negatives of a number.
The positive and negative of a number will always add upto zero.
Now if the required array has even length, we omit zero,
else, we consider zero as well.
*/

class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        if(n%2==0){
            for(int i=0;i<n;i++){
                ans[i] = (i+1);
                ans[i+1] = -1*(i+1);
                i++;
            }
        } else {
            ans[0] = 0;
            for(int i=1;i<n;i++){
                ans[i] = i;
                ans[i+1] = -1*i;
                i++;
            }
        }

        return ans;
    }
}
