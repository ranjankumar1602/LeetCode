class Solution {
    public int findJudge(int n, int[][] trust) {
        int ans[] = new int[n+1];
        for(int[] i : trust) {
            ans[i[0]]--;
            ans[i[1]]++;
        }
        for(int i = 1; i <= n; i++) {
            if(ans[i] == n - 1) {
                return i;
            }
        }
        return -1;
    }
}
