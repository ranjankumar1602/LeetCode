class Solution {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        Stack<Integer> number = new Stack<>();
        String str = "";
        int i = 0;
        while(i < s.length()) {
            if(Character.isDigit(s.charAt(i))) {
                int num = 0;
                while(Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                number.push(num);
            }else if(s.charAt(i) == '[') {
                stack.push(str);
                str = "";
                i++;
            }else if(s.charAt(i) == ']') {
                StringBuilder temp = new StringBuilder(stack.pop());
                int tnum = number.pop();
                for(int j = 0; j < tnum; j++) {
                    temp.append(str);
                }
                str = temp.toString();
                i++;
            }else {
                str += s.charAt(i);
                i++;
            }
        }
        return str;
    }
}
