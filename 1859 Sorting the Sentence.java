class Solution {
    public String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] sorted = new String[str.length];
        StringBuilder ans = new StringBuilder();
        int idx = 0;
        for(String word : str) {
            idx = (int)(word.charAt(word.length() - 1) - '0');
            sorted[idx -1] = word.substring(0, word.length() - 1);
        }
        for(String elem : sorted) {
            ans.append(elem).append(" ");
        }
        return ans.toString().substring(0, ans.length()-1);
    }
}
