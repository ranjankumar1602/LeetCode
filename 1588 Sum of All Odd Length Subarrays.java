class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans = 0;
        for(int i = 0; i < arr.length; i++) {
            int left = i;
            int right = arr.length - 1 - i;
            ans += arr[i] * (left / 2 + 1) * (right / 2 + 1);
            ans += arr[i] * ((left + 1) / 2) * ((right + 1) / 2);
        }
        return ans;
    }
}
