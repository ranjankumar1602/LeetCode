class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        int[] rolls = new int[n * n + 1];
        Arrays.fill(rolls, -1);
        Queue<Integer> queue = new LinkedList<>();
        rolls[1] = 0;
        queue.offer(1);

        while(!queue.isEmpty()) {
            int x = queue.poll();
            for(int i = 1; i <= 6 && x + i <= n * n; i++) {
                int j = x + i;
                int row = (j - 1) / n;
                int col = (j - 1) % n;
                int v = board[n - 1 - row][(row % 2 == 1) ? (n - 1 - col) : col];
                int y = (v > 0 ? v : j);
                if(y == n * n) {
                    return rolls[x] + 1;
                }
                if(rolls[y] == -1) {
                    rolls[y] = rolls[x] + 1;
                    queue.offer(y);
                }
            }
        }
        return -1;
    }
}
