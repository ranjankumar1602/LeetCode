class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int row = 0; row < matrix.length; row++) {
            for(int column = 0; column < matrix[0].length; column++) {
                pq.add(matrix[row][column]);
                if(pq.size() > k) {
                    pq.poll();
                }
            }
        }
        return pq.poll();
    }
}
