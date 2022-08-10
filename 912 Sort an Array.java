class Solution {
    
    public static int partition(int arr[], int low , int high) {
        int pivot = arr[high];
        int count = low - 1;
        for(int j = low; j < high; j++) {
            if(arr[j] < pivot) {
                count++;
                
                int temp = arr[count];
                arr[count] = arr[j];
                arr[j] = temp;
            }
            
        }
        int temp = arr[count + 1];
        arr[count + 1] = arr[high];
        arr[high] = temp;
        
        return count + 1;
        
    }
    
    public static void quickSort(int arr[], int low, int high) {
        if(low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }
    
    public int[] sortArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        quickSort(nums, start, end);
        return nums;
    }
}
