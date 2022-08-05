class Solution {
    public int removeDuplicates(int[] nums) {
        int duplicates=0;
        for(int i=1;i<nums.length;i++) {
            if(nums[i-1]==nums[i]) {
                duplicates++;
            }
            nums[i-duplicates]=nums[i];
        }
        return nums.length-duplicates;
    }
}
