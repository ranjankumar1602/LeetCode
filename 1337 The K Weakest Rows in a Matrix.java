class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] == b[0] ? b[1] - a[1] : b[0]-a[0]);
        for(int i = 0; i < mat.length; i++) {
            int count = 0;
            for(int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] == 1) {
                    count++;
                }
            }
            pq.offer(new int[]{count, i});
            if(pq.size() > k) {
                pq.poll();
            }
        }
        int ans[] = new int[k];
        while(k > 0) {
            ans[--k] = pq.poll()[1];
        }
        return ans;
    }
}
