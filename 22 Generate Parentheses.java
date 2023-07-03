class Solution {
    public void generateParenthesis(List<String> list, String str, int start, int end, int max) {
        if(str.length() == 2 * max) {
            list.add(str);
            return;
        }
        if(start < max) {
            generateParenthesis(list, str + "(", start + 1, end, max);
        }
        if(end < start) {
            generateParenthesis(list, str + ")", start, end + 1, max);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generateParenthesis(list, "", 0, 0, n);
        return list;
    }
}
