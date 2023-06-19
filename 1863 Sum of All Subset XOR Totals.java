class Solution {
    private int subsetXORSum(int[] nums, int idx, int currXOR) {
        if(idx == nums.length) {
            return currXOR;
        }
        return subsetXORSum(nums, idx + 1, currXOR) + subsetXORSum(nums, idx + 1, currXOR ^ nums[idx]);
    }
    public int subsetXORSum(int[] nums) {
        return subsetXORSum(nums, 0, 0);
    }
}
