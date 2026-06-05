class Solution {
    private void reverse(int[] arr, int start, int end) {
        while(start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public void nextPermutation(int[] nums) {
        // find the pivot
        int pivot = -1;
        int len = nums.length;

        for(int i = len - 2; i >= 0; i--) {
            if(nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }
        if(pivot == -1) {
            reverse(nums, 0, len - 1);
            return;
        }

        // find next larger element
        for(int i = len - 1; i > pivot; i--) {
            if(nums[i] > nums[pivot]) {
                swap(nums, i, pivot);
                break;
            }
        }

        // reverse 
        reverse(nums, pivot + 1, len - 1);
    }
}
