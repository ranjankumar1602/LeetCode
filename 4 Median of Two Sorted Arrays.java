class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length<=0 && nums2.length<=0) {
            return -1.0;
        }
        int m = nums1.length;
        int n = nums2.length;
        int arr[] = new int[m + n];
        int i=0, j=0,k=0;
        while(i < m && j < n) {
            if(nums1[i]<=nums2[j]) {
                arr[k]=nums1[i];
                i++;
                k++;
            }else {
                arr[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<m) {
            arr[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n) {
            arr[k]=nums2[j];
            j++;
            k++;
        }
        int na = arr.length;
        if(na % 2 != 0) {
            return (double)(arr[na/2]);
        }else {
            return (double)(arr[(na-1)/2] + arr[na/2])/2;
        }
        
    }
}
