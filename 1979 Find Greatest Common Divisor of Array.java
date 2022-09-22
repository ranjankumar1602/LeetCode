class Solution {
    private int findGCD(int a, int b) {
        while(b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return findGCD(nums[0], nums[nums.length-1]);
    }
}
