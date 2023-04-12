class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        for(String str : path.split("/")) {
            if(str.equals("..")) {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            }else if(str.length() > 0 && !str.equals(".")) {
                stack.push(str);
            }
        }
        return "/" + String.join("/",stack);
    }
}
