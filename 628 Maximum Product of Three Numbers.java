class Solution {
    public int maximumProduct(int[] nums) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: nums) {
            pq1.add(i);
            pq2.add(i);
            while(pq1.size() > 3) {
                pq1.poll();
            }
            while(pq2.size() > 2) {
                pq2.poll();
            }
        }
        int prod1 = 1;
        int max = 0;
        while(!pq1.isEmpty()) {
            max = pq1.poll();
            prod1 *= max;
        }
        while(!pq2.isEmpty()) {
            max *= pq2.poll();
        }
        return Math.max(prod1,max);
    }
}
