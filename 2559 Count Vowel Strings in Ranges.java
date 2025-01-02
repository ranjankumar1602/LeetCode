class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        HashSet<Character> vow = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        int[] ans = new int[queries.length];
        int[] prefix = new int[words.length];
        int sum = 0;
        for(int i = 0; i < words.length; i++) {
            String curr = words[i];
            if(vow.contains(curr.charAt(0)) && vow.contains(curr.charAt(curr.length() - 1))) {
                sum++;
            }
            prefix[i] = sum;
        }
        for(int i = 0; i < queries.length; i++) {
            int[] currQ = queries[i];
            ans[i] = prefix[currQ[1]] - (currQ[0] == 0 ? 0 :prefix[currQ[0] - 1]);
        }
        return ans;
    }
}
