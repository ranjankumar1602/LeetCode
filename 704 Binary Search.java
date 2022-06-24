class Solution {
    public int search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        while(start<=end) {
            int mid=(start + end) / 2;
            if(nums[mid]==target) {
                return mid;
            }else if(nums[mid]<target) {
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return -1;
    }
}


/*
Solution using recursion

class Solution {
    
    private static int search(int[] arr,int start,int end,int target) {
        if(start>end) {
            return -1;
        }
        
        int mid=(start + end)/2;
        
        if(arr[mid]==target) {
            return mid;
        }else if(target<arr[mid]) {
            return search(arr,start,mid-1,target);
        }else{
            return search(arr,mid+1,end,target);
        }
        
    }
    
    
    public int search(int[] nums, int target) {
        int end=nums.length-1;
        int start=0;
        
        return search(nums,start,end,target);
    }
}
*/
