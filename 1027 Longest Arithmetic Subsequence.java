class Solution {
    public int longestArithSeqLength(int[] nums) {
        if(nums.length <= 2) {
            return nums.length;
        }
        int max = 2;
        Map<Integer, Integer>[] dp = new HashMap[nums.length];
        for(int i = 0; i < nums.length; i++) {
            dp[i] = new HashMap<>();
            for(int j = 0; j < i; j++) {
                int diff = nums[i] - nums[j];
                dp[i].put(diff, dp[j].getOrDefault(diff, 1) + 1);
                max = Math.max(max, dp[i].get(diff));
            }
        }
        return max;
    }
}
