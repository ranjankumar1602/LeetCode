class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = nums[nums.length - 1];
        int ans = 0;
        while(k > 0) {
            ans += sum;
            sum++;
            k--;
        }
        return ans;
    }
}
