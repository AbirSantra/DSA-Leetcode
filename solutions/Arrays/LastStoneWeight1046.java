// Question Link: https://leetcode.com/problems/last-stone-weight/description/
/* 
Approach: Since everytime we need to consider only the top two heaviest stones, 
we will use a priority queue with a reverse comparator to get the heaviest stones.
First we fill the queue with the elements of the array. Then we loop till we reach one element of the array. 
Each time we pop the heaviest two elements and compare them. If they are unequal, we add the remainder of the 'smash' to the queue. 
At the end we check if any element is remaining in the queue and return it else we return 0;
 */

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<stones.length;i++){
            queue.add(stones[i]);
        }

        while(queue.size() > 1){
            int x = queue.poll();
            int y = queue.poll();
            if(x!=y){
                queue.add(x-y);
            }
        }

        if(queue.peek()==null){
            return 0;
        } else {
            return queue.poll();
        }
    }
}
