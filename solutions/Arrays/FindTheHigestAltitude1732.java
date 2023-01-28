package Arrays;
//Question: https://leetcode.com/problems/find-the-highest-altitude/
public class FindTheHigestAltitude1732 {
    public static void main(String[] args) {
        int[] gain = new int[]{44,32,-9,52,23,-50,50,33,-84,47,-14,84,36,-62,37,81,-36,-85,-39,67,-63,64,-47,95,91,-40,65,67,92,-28,97,100,81}; //ans: 781
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain){
        int ans = 0; //since we always start out at atleast altitude 0
        int alt = 0;
        for (int j : gain) {
            alt = alt + j;
            ans = Integer.max(ans, alt);
        }
        return ans;
    }
}
