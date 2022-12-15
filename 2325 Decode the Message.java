class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap<>();
        int count = 0;
        for (char c : key.toCharArray()) {
            if (Character.isLetter(c) && !map.containsKey(c)) {
                map.put(c, (char) ('a' + count));
                count++;
            }
        }

        char[] result = message.toCharArray();
        for (int i = 0; i < result.length; i++) {
            char c = result[i];
            if (c != ' ') {
                result[i] = map.get(c);
            }
        }
        return String.valueOf(result);
    }
}
