// QuestionLink: https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
/* 
Approach:
We can see that, moving 2 steps have no cost.
So moving from even to even position, e.g 2 to 4 has zero cost.
Moving from odd to odd position, e.g 1 to 3 will have zero cost.
So basically, we can move all coins from the even positions to position 0 with no cost.
We can move all coins from the odd positions to position 1 with no cost.
Now all the coins are in the 0th position or the 1st position.
So moving the coins from the position which can lesser number of coins,
will be cheaper.
So we count the number of coins in even and odd positions,
and return the lesser one.
*/

class Solution {
    public int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;
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
