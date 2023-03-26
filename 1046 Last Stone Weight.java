class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> lastStone = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones) {
            lastStone.offer(stone);
        }
        while(lastStone.size() > 1) {
            lastStone.offer(lastStone.poll() - lastStone.poll());
        }
        return lastStone.poll();
    }
}
