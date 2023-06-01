class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = nums.length-1; i >= 0; i--) {
            while(nums[i]  > 9) {
                list.add(nums[i]%10);
                nums[i] /= 10;
            }
            list.add(nums[i]);
        }
        Collections.reverse(list);
        int[] ans = new int[list.size()];
        int idx = 0;
        for(int i : list) {
            ans[idx++] = i;
        }
        return ans;
    }
}
