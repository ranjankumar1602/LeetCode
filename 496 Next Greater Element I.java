class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // creating a hashmap to store the value for nums2
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        // adding the values to the map
        for(int i : nums2) {
            while(!stack.isEmpty() && stack.peek() < i) {
                map.put(stack.pop(), i);
            }
            stack.push(i);
        }
        // checking for available higher value element from nums1 in the map
        for(int i = 0; i < nums1.length; i++) {
            nums1[i] = map.getOrDefault(nums1[i], -1);          
        }
        return nums1;
    }
}
