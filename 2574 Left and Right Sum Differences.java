class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int left = 0;
        int sum = 0;
        for(int i : nums) {
            sum += i;
        }
        for(int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            sum -= temp;
            nums[i] = Math.abs(sum - left);
            left += temp;
        }
        return nums;
    }
}
