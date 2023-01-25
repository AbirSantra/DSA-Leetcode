// Question Link: https://leetcode.com/problems/guess-number-higher-or-lower/description/

// This problem is simply a binary search, where the target number or the number we are searching for is being provided by a function guess().

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        if(n == 1){
            return 1;
        }

        int start = 1;
        int end = n;

        while(start<=end){
            int mid = start + (end - start)/2;

            int result = guess(mid);

            if(result == 0){
                return mid;
            } else if(result == 1){
                start = mid + 1;
            } else if(result == -1){
                end = mid - 1;
            }
        }

        return -1;
    }
}
