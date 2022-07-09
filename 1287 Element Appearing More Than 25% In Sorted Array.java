class Solution {
    public int findSpecialInteger(int[] arr) {
        int len = arr.length;
        int ans= len/4;
        for(int i=0; i<len-ans; i++) {
            if(arr[i] == arr[i + ans]) {
                return arr[i];
            }
        }
        return -1;
    }
}
