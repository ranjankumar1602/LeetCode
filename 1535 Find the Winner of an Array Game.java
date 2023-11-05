class Solution {
    public int getWinner(int[] arr, int k) {
        int max = arr[0];
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            queue.offer(arr[i]);
        }
        int curr = arr[0];
        int streak = 0;
        while(!queue.isEmpty()) {
            int next = queue.poll();
            if(curr > next) {
                queue.offer(next);
                streak++;
            }else {
                queue.offer(curr);
                curr = next;
                streak = 1; 
            }
            if(streak == k || curr == max) {
                return curr;
            }
        }
        return -1;
    }
}
