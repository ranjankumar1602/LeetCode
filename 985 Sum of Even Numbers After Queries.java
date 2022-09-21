class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                sum += nums[i];
            }
        }
        int ans[] = new int[queries.length];
        for(int i = 0; i < queries.length; i++) {
            int temp = queries[i][0];
            int index = queries[i][1];
            if(nums[index] % 2 == 0) {
                sum -= nums[index];
            }
            nums[index] += temp;
            if (nums[index] % 2 == 0) {
                sum += nums[index];
            }
            ans[i] = sum;
        }
        return ans;
    }
}
