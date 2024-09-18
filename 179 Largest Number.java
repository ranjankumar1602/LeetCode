class Solution {
    public String largestNumber(int[] nums) {
        PriorityQueue<String> max = new PriorityQueue<>((a,b) -> (b+a).compareTo(a+b));
        for(int num : nums) {
            max.offer(String.valueOf(num));
        }
        String ans = "";
        while(!max.isEmpty()) {
            ans += max.poll() + "";
        }
        return ans.charAt(0) == '0' ? "0" : ans;
    }
}
