class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i : nums) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }else {
                map.put(i, 1);
            }
        }
        int count = 0;
        for(int i:nums) {
            if(map.containsKey(i-k)) {
                count += map.get(i-k);
            }
        }
        return count;
    }
}
