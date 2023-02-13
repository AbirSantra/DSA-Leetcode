// Question Link: https://leetcode.com/problems/intersection-of-two-arrays/description/

/* Approach: We use a hash set to store the result so that there are no duplicates. 
We sort the second array and then for each num in the first array, we use binary search 
to check if that num exists in the second array. If it does, we add it to the intersection set. 
Then we convert the set to an array and return the answer. */

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> intersection = new HashSet<Integer>();
        Arrays.sort(nums2);

        for(Integer num : nums1){
            if(binSearch(nums2,num)){
                intersection.add(num);
            }
        }

        int[] ans = new int[intersection.size()];
        int i = 0;

        for(Integer num : intersection){
            ans[i++] = num;
        }
        
        return ans;
    }

    static boolean binSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return true;
            } else if(arr[mid] < target){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}