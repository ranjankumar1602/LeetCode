// using backtracking

class Solution {
    private static void getCombination(String digit, int idx, HashMap<Character, String> map, List<String> ans, StringBuilder str) {
        if(idx == digit.length()) {
            ans.add(str.toString());
            return;
        }
        String temp = map.get(digit.charAt(idx));
        for(int i = 0; i < temp.length(); i++) {
            str.append(temp.charAt(i));
            getCombination(digit, idx + 1, map, ans, str);
            str.deleteCharAt(str.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length() <= 0) {
            return ans;
        }
        HashMap<Character, String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        getCombination(digits, 0, map, ans, new StringBuilder());
        return ans;
    }
}
