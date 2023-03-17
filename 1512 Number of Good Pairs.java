class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            int temp = map.getOrDefault(i, 0);
            count += temp;
            map.put(i, temp + 1);
        }
        return count;
    }
}


/*
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(i<j && nums[i]==nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
*/
