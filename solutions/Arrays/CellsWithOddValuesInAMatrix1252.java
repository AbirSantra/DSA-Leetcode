// Question Link: https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/description/

/* 
Approach:
We are simply concerned with the number of odd values on the array.
We take two boolean arrays rows and cols to determine whether, after increments,
the rows and cols are odd or not. True = Odd and false = Even.
Then we count how many rows are odd and how many are even.
We do a similar thing with the cols.
Now for the answer, if there are two rows and three columns,
the only combinations with give odd numbers are the positions where row is odd and col is even,
or, row is even and col is odd. That is either row is incremented or col is incremented.
So answer is given by: oddRow*evenCol + evenRow*oddCol
*/

class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];

        // Count increments
        for(int i=0;i<indices.length;i++){
            int a = indices[i][0];
            int b = indices[i][1];
            rows[a] = !rows[a];
            cols[b] = !cols[b];
        }

        int oddRow = 0;
        int evenRow = 0;
        int oddCol = 0;
        int evenCol = 0;

        for(int i=0;i<m;i++){
            if(rows[i]==true){
                oddRow++;
            } else {
                evenRow++;
            }
        }

        for(int i=0;i<n;i++){
            if(cols[i]==true){
                oddCol++;
            } else {
                evenCol++;
            }
        }

        return (oddRow*evenCol)+(evenRow*oddCol);
    }
}
