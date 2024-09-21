class Solution {
    private void lexicalOrder(int start, int end, List<Integer> ans) {
        if(start > end) {
            return;
        }
        ans.add(start);

        for(int next = 0; next <= 9; next++) {
            int nextNum = start * 10 + next;
            if(nextNum <= end) {
                lexicalOrder(nextNum, end, ans);
            } else {
                break;
            }
        }
    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer> num = new ArrayList<>();
        for(int start = 1; start <= 9; start++) {
            lexicalOrder(start, n, num);
        }
        return num;
    }
}
