package Arrays;

import java.util.ArrayList;
import java.util.List;

//Question: https://leetcode.com/problems/count-items-matching-a-rule/
public class CountItemsMatchingARule1773 {
    public static void main(String[] args) {
        //main method
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue){
        int ans = 0;
        int index = 0;
        if (ruleKey.equals("color")) index = 1;
        else if (ruleKey.equals("name")) index = 2;
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) ans++;
        }
        return ans;
    }
}
