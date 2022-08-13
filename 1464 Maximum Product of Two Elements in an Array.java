class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i = 0; i < nums.length; i++) {
            queue.add(nums[i]);
        }
        return ((queue.poll()) - 1) * ((queue.poll()) - 1);
    }
}
