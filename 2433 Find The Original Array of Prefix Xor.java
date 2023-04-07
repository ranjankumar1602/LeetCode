class Solution {
    public int[] findArray(int[] pref) {
        int xor = 0;
        for(int i = 1; i < pref.length; i++) {
            xor ^= pref[i-1];
            pref[i] ^= xor;
        }
        return pref;
    }
}
