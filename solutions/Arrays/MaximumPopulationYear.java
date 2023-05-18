// Question Link: https://leetcode.com/problems/maximum-population-year/
/* 
O[n^2]
Approach:
We consider a frequency array of the years from 1950 to 2050 which are the constraints.
Now for each entry of the logs, we run a loop from the birth till before death
and increment the population for those years.
At the end, we check the freq array and return the maximum year.
*/

// class Solution {
//     public int maximumPopulation(int[][] logs) {
//         int[] pop = new int[100];
//         int ans = 0;
//         for(int i=0;i<logs.length;i++){
//             int birth = logs[i][0];
//             int death = logs[i][1];
//             for(int j=birth;j<death;j++){
//                 pop[j-1950]++;
//             }
//         }

//         int max = 0;
//         for(int i=0;i<pop.length;i++){
//             if(pop[i]>max){
//                 max = pop[i];
//                 ans = i + 1950;
//             }
//         }

//         return ans;
//     }
// }

/* 
O[n]
Approach Two: 
In this approach, we make use of a prefix sum. That is, the sum of the current element
and the previous element.
So for each entry, we increment the birth year and decrement the death year.
Then while checking the frequency array, we update the values with the prefix sum.
So if birth is 1950 and death is 1960,
Freq = [1,0,0,0,0,0,0,0,-1]
After prefix sum updation, we get the desired freq array:
[1,1,1,1,1,1,1,1,0]
And then we return the max from there.
*/
class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] pop = new int[101];
        int max = 0;
        int ans = 1950;

        // Increment birth year & decrement death year
        for(int i=0;i<logs.length;i++){
            pop[logs[i][0] - 1950]++;
            pop[logs[i][1] - 1950]--;
        }

        // Calculate the prefix sum
        for(int i=1;i<pop.length;i++){
            pop[i] += pop[i-1];
        }

        // Find max
        for(int i=0;i<pop.length;i++){
            if(pop[i]>max){
                max = pop[i];
                ans = i + 1950;
            }
        }

        return ans;
    }
}
