class Solution {
    int[] days;
    int[] costs;
    Integer[] temp;
    int[] ways = new int[]{1, 7, 30};

    private int dp(int i) {
        if(i >= days.length) {
            return 0;
        }
        if(temp[i] != null) {
            return temp[i];
        }
        int ans = Integer.MAX_VALUE;
        int k = i;
        for(int j = 0; j < 3; j++) {
            while(k < days.length && days[k] < days[i] + ways[j]) 
            {
                k++;
            }
            ans = Math.min(ans, dp(k) + costs[j]);
        }
        temp[i] = ans;
        return ans;
    }
    public int mincostTickets(int[] days, int[] costs) {
        this.days = days;
        this.costs = costs;
        temp = new Integer[days.length];
        return dp(0);
    }
}
