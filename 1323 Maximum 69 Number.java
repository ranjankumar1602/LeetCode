class Solution {
    public int maximum69Number (int num) {
        String ans = "" + num;
        return Integer.parseInt(ans.replaceFirst("6", "9"));
    }
}
