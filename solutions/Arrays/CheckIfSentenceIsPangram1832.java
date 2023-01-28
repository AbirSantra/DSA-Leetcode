package Arrays;
//Question: https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public class CheckIfSentenceIsPangram1832 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
//    O(n2) solution / Brute approach
//    public static boolean checkIfPangram(String sentence){
//        for(char i='a';i<='z';i++){
//            int count =0;
//            for(int j=0;j<sentence.length();j++){
//                if(sentence.charAt(j)==i){
//                    count++;
//                }
//            }
//            if(count==0) return false;
//        }
//        return true;
//    }

//    O(n) approach using count array
//    public static boolean checkIfPangram(String sentence){
//        int[] alpha = new int[26]; //to store the frequency of each alphabet
//        for(int i=0;i<sentence.length();i++){
//            int index = (int)sentence.charAt(i)-97;
//            alpha[index]++;
//        }
//        for (int i=0;i<alpha.length;i++){
//            if(alpha[i]==0) return false;
//        }
//        return true;
//    }

//    Using contains() method
    public static boolean checkIfPangram(String sentence){
        if(sentence.length()<26) return false;

        for (int i=0;i<26;i++){
            if(!sentence.contains(Character.toString(i+97))) return false;
        }
        return true;
    }
}
