class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = words.length;
        int set[] = new int[26];
        for(char ch : allowed.toCharArray()) {
            set[ch - 'a']++;
        }
        for(String word : words) {
            for(char c : word.toCharArray()) {
                if(set[c-'a'] <= 0) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}
