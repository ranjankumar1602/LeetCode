class Solution {
    public int majorityElement(int[] nums) {
        int element = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == element) {
                count++;
            }else if(count == 0) {
                element = nums[i];
                count = 1;
            }else {
                count--;
            }
        }
        return element;
    }
}
