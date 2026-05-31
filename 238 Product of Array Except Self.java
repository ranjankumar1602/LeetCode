class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left = 1;
        int right = 1;
        int len = nums.length;
        int[] ans = new int[nums.length];
        Arrays.fill(ans, 1);
        for(int i = 0; i < len; i++) {
            ans[i] *= left;
            left *= nums[i];
            int j = len - i - 1;
            ans[j] *= right;
            right *= nums[j];
        }
        return ans;
    }
}
