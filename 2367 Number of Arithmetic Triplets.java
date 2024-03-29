class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i] + diff) && set.contains(nums[i] + diff + diff)) {
                count++;
            }
        }
        return count;
    }
}
