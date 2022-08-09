class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0;
        for(;i<k;i++) {
            pq.add(nums[i]);
        }
        for(;i<nums.length;i++) {
            int min = pq.element();
            if(nums[i]> min) {
                pq.remove();
                pq.add(nums[i]);
            }
        }
        return pq.element();
    }
}
