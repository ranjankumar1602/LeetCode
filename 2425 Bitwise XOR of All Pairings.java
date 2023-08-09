class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int ans = 0;
        for(int i=0; i < nums1.length; i++) {
            ans ^= nums1[i];
        }
        int ans2 = 0;
        for(int i = 0; i < nums2.length;i++) {
            ans2 ^= nums2[i];
        }
        return ((nums1.length % 2) * ans2) ^ ((nums2.length % 2) * ans);
    }
}
