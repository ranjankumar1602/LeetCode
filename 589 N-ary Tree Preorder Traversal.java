/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    private static void preorder(Node root, List<Integer> ans) {
        ans.add(root.val);
        for(int i = 0; i < root.children.size(); i++) {
            preorder(root.children.get(i), ans);
        }
    }
    public List<Integer> preorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }
        preorder(root, ans);
        return ans;
    }
}
