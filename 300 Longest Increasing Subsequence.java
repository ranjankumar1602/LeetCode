class Solution {
    public int lengthOfLIS(int[] nums) {
        int storage[] = new int[nums.length];
        storage[0] = 1;
        for(int i = 1; i < nums.length; i++) {
            for(int j = i - 1; j >= 0; j--) {
                if(nums[j] < nums[i] && storage[i] < storage[j] + 1) {
                    storage[i] = storage[j] + 1;
                }else {
                    storage[i] = Math.max(1,storage[i]);
                }
            }
        }
        int max = storage[0];
        for(int i = 0; i < storage.length; i++) {
            if(storage[i] > max) {
                max = storage[i];
            }
        }
        return max;
    }
}
