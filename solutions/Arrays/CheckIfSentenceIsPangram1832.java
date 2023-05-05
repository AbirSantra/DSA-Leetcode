//Question Link: https://leetcode.com/problems/check-if-the-sentence-is-pangram/
/*
Approach:
1. If a sentence is pangram, its length must be 26 or more. Check that first
2. Create a frequency array of size 26 which stores the occurences of all the alphabets
3. Check if any position is empty in the freq array.
4. If yes, return false.
*/
class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }

        int[] freq = new int[26];
        for(int i=0;i<sentence.length();i++){
            freq[(int)sentence.charAt(i)-97]++;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]==0){
                return false;
            }
        }

        return true;
    }
}
