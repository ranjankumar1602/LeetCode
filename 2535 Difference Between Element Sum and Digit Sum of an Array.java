class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int digitSum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int digit = nums[i];
            while(digit > 9) {
                digitSum += digit % 10;
                digit /= 10;
            }
            digitSum += digit;
        }
        return Math.abs(sum - digitSum);
    }
}
