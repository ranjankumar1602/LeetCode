class Solution {
    public int missingNumber(int[] nums) {
    // sum of n natural numbers = n * (n + 1) / 2;
        int nsum= ((nums.length) * (nums.length + 1)) / 2;
        int sum=0;
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
        }
        return nsum-sum;
    }
}
