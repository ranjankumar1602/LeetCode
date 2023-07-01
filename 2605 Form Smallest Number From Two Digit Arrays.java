class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i : nums1) {
            map.put(i , map.getOrDefault(i, 0) + 1);
        }
        for(int i : nums2) {
            map.put(i , map.getOrDefault(i, 0) + 1);
        }
        int ans = 0;
        for(int i : nums1) {
            if(map.get(i) >= 2) {
                return i;
            }
        }
        if(nums1[0] <= nums2[0]) {
            ans += nums1[0];
            ans *= 10;
            ans += nums2[0];
        }else {
            ans += nums2[0];
            ans *= 10;
            ans += nums1[0];
        }
        
        return ans;

        
    }
}
