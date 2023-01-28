// Question Link: https://leetcode.com/problems/first-bad-version/description/

// We consider an array from 1 to n. We perform simple binary search and find the mid element. If this mid element is not a bad version. That means a bad version exists on the right side of the mid element. So we begin searching in the right side. However, if mid element is a bad version, it may or may not be the first bad version. So we include it in the answer as a probable answer but then also search again in the left side for bad versions which might exist before mid. If another bad version is found in the left hand side, the answer gets updated. At the end, we return the answer.

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n == 1){
            return 1;
        }

        int start = 1;
        int end = n;
        int ans = -1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(!isBadVersion(mid)){
                start = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }

        return ans;
    }
}
