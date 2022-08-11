class Solution {
    
    private static void heapify(int[] arr, int i){
        int childIndex = i;
        int parentIndex = (childIndex - 1)/2;
        while(childIndex > 0) {
            if(arr[childIndex] > arr[parentIndex]) {
                int temp = arr[childIndex];
                arr[childIndex] = arr[parentIndex];
                arr[parentIndex] = temp;
                childIndex = parentIndex;
                parentIndex = (childIndex - 1)/2;
            }else {
                return;
            }
        }
    }
    
    private static int removeHeap(int[] arr, int size) {
        int temp = arr[0];
        arr[0] = arr[size - 1];
        size--;
        int index = 0;
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;
        while(leftChildIndex < size) {
            int minIndex = index;
            if(arr[leftChildIndex] > arr[minIndex]) {
                minIndex = leftChildIndex;
            }
            if(rightChildIndex < size && arr[rightChildIndex] > arr[minIndex]) {
                minIndex = rightChildIndex;
            }
            if(minIndex != index) {
                int temp1 = arr[index];
                arr[index] = arr[minIndex];
                arr[minIndex] = temp1;
                index = minIndex;
                leftChildIndex = 2 * index + 1;
                rightChildIndex = 2 * index + 2;
            }else {
                break;
            }
        }
        return temp;
    }
    
    public int[] sortArray(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            heapify(nums, i);
        }
        for(int i = 0; i < nums.length; i++) {
            nums[nums.length - 1 - i] = removeHeap(nums, nums.length - i);
        }
        return nums;
    }
}
