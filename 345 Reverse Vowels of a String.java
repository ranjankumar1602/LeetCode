class Solution {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int start = 0, end = s.length() - 1;
        String vowels = "aeiouAEIOU";
        while(start < end) {
            while(start < end && vowels.indexOf(word[start]) == -1) start++;

            while(start < end && vowels.indexOf(word[end]) == -1) end--;

            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;

            start++;
            end--;
        }
        String result = new String(word);
        return result;
    }
}
