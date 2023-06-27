class Solution {
    
    public void rotate(int[] nums, int low, int high) {
        while(low<high) {
            int temp=nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
            low++;
            high--;
        }
    }
    
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        k = k % len;
        rotate(nums, 0, len-k-1);
        rotate(nums, len-k, len-1);
        rotate(nums, 0, len-1);
    }
}
