class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans= new int[nums.length-k+1];
        Deque<Integer> deque= new ArrayDeque<>();
        int index=0;
        for(int i=0;i<nums.length;i++){
            while(!deque.isEmpty() && deque.peekFirst()<i-k+1){
                deque.removeFirst();
            }
            while(!deque.isEmpty() && nums[deque.peekLast()]<nums[i]){
                deque.removeLast();
            }
            deque.addLast(i);
            if(i>=k-1){
                ans[index]=nums[deque.peekFirst()];
                index++;
            }
        }
        return ans;
    }

}
