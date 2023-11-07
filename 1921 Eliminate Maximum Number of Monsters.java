class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        PriorityQueue<Double> pq = new PriorityQueue();
        for(int i = 0; i < dist.length; i++) {
            pq.add((double) dist[i] / speed[i]);
        }
        int maxMons = 0;
        while(!pq.isEmpty()) {
            if(pq.poll() <= maxMons) {
                break;
            }
            maxMons++;
        }
        return maxMons;
    }
}
