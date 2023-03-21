class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        long subArray = 0;
        for(int i : nums) {
            if(i == 0) {
                subArray++;
            }else {
                subArray = 0;
            }
            ans += subArray;
        }
        return ans;
    }
}
