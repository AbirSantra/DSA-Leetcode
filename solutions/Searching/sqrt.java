// Use simple binary search to solve this problem. If the square of the mid element is equal to x, then mid is the answer. Else if sqr of mid is greater than x, then search in the left hand side. Else, search in the right hand side. If mid is never returned, that means x is not a perfect square. So return end.

class Solution {
    public int mySqrt(int x) {
        if(x == 0){
            return 0;
        } else {
            int start = 1;
            int end = x;

            while(start<=end){
                int mid = start + (end - start)/2;

                if(mid == x/mid){
                    return mid;
                } else if (mid < x/mid){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            return end;
        }
    }
}
