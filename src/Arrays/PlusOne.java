class Solution {
    public int[] plusOne(int[] digits) {
        // since we need to add only 1 to the number, we take 1 as the initial carry and add the carry to each digit one by one. If it results to 10 we add 0 to the new number and make carry 1. If sum is less than 10 then we simply add with carry and add it to the new number and make carry 0. At the end, we check if there is still a carry remaining and add 1 to the new number.
        int carry  = 1;
        List<Integer> newDigits = new ArrayList<>();
        for(int i=digits.length-1;i>=0;i--){
            int sum = digits[i] + carry;
            if(sum == 10){
                newDigits.add(0,0);
                carry = 1;
            } else {
                newDigits.add(0,sum);
                carry = 0;
            }
        }
        
        if(carry == 1){
            newDigits.add(0,1);
        }
        
        int[] ans = new int[newDigits.size()];
        for(int i=0;i<ans.length;i++){
            ans[i] = newDigits.get(i);
        }
        
        return ans;
    }
}
