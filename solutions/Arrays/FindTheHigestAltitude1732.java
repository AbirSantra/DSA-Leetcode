// Question Link: https://leetcode.com/problems/find-the-highest-altitude/
/* 
Approach: 
We essentially need to calculate the running sum of the altitudes,
and in each altitude, we check if it is the maximum altitude reached yet.
If yes, we update 'highest'. 
At the end, return 'highest'
*/
class Solution {
    public int largestAltitude(int[] gain) {
        int highest = 0;
        int rSum = 0;

        for(int i=0;i<gain.length;i++){
            rSum = rSum + gain[i];
            highest = Math.max(rSum,highest);
        }

        return highest;
    }
}
