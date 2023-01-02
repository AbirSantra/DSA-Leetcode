// Here, even-to-even movement and odd-to-odd movement is cost 0. And even-to-odd or odd-to-even movements is cost 1. So we can move all chips at even positions to position 0 with no cost as well as we can move all chips at odd positions to position 1 with no cost. So finally we just need to move either chips from position 0 to position 1 or position 1 to position 0 depending on which cost less. So we will count the number of chips at even and odd locations respectively and then return the one which is minimum to get the answer.

class Solution {
    public int minCostToMoveChips(int[] position) {
        int odd = 0;
        int even = 0;
        for(int i=0;i<position.length;i++){
            if(position[i]%2==0){
                even++;
            } else {
                odd++;
            }
        }

        return Math.min(even,odd);
    }
}
