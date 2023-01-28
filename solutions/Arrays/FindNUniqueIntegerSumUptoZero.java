class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        
        if(n%2!=0){
            ans[0] = 0;
            for(int i=1;i<n;i++){
                ans[i] = i;
                ans[i+1] = -i;
                i++;
            }
        } else {
            for(int i=0;i<n;i++){
                ans[i] = i+1;
                ans[i+1] = -(i+1);
                i++;
            }
        }
        
        return ans;
    }
}
