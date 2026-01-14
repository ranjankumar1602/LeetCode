class Solution {
    public int maxProduct(int[] nums) {
        int size = nums.length;
        int ans = nums[0];
        int left = 0, right = 0;
        for(int i = 0; i < size; i++) {
            left = (left == 0 ? 1 : left) * nums[i];
            right = (right == 0 ? 1 : right) * nums[size - 1 - i];
            ans = Math.max(ans, Math.max(left, right));
        }
        return ans;
    }
}
