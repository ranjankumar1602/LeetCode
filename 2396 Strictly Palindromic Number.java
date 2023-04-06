class Solution {
    private boolean palindromic(String str) {
        int left = 0;
        int right = str.length()-1;
        while(left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean isStrictlyPalindromic(int n) {
        for(int i = 2; i < n - 1; i++) {
            if(!palindromic(Integer.toString(n, i))) {
                return false;
            }
        }
        return true;
    }
}
