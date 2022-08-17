class Solution {
    private static int first(int[] nums, int target) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(nums[mid] >= target) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
            if(nums[mid] == target) {
                ans = mid;
            }
        }
        return ans;
    }
    
    private static int last(int[] nums, int target) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(nums[mid] <= target) {
                start = mid + 1;
            }else {
                end = mid - 1; 
            }
            if(nums[mid] == target) {
                ans = mid;
            }
        }
        return ans;
    }
    
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        ans[0] = first(nums, target);
        ans[1] = last(nums, target);
        return ans;
    }
}
