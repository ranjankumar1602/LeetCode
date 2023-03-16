class Solution {
    private static boolean isEqual(int[] frequency) {
        int prevCount = 0;
        for(int count : frequency) {
            if(count == 0) {
                continue;
            }
            if(prevCount != 0 && prevCount != count) {
                return false;
            }
            prevCount = count;
        }
        return true;
    }
    public boolean equalFrequency(String word) {
        int frequency[] = new int[26];
        for(char ch : word.toCharArray()) {
            frequency[ch - 'a']++;
        }
        for(int i = 0; i < 26; i++) {
            frequency[i]--;
            if(isEqual(frequency)) {
                return true;
            }
            frequency[i]++;
        }
        return false;
    }
}
