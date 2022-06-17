package Arrays;

import java.util.ArrayList;
import java.util.List;

//Question: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class KidsWithTheGreatestNumberOfCandies1431 {
    public static void main(String[] args) {
        int[] candies = new int[]{4,2,1,1,2};
        System.out.println(kidsWithCandies(candies,1));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        List<Boolean> ans = new ArrayList<Boolean>();
        int max =0;
        for (int i=0;i<candies.length;i++){
            if(max<candies[i]){
                max = candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies >= max){
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }
}
