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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new LinkedList<>();
        if(root == null) {
            return ans;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            List<Integer> level = new LinkedList<>();
            int len = queue.size();
            for(int i = 0; i < len; i++) {
                Node curr = queue.poll();
                level.add(curr.val);
                for(Node alpha : curr.children) {
                    queue.add(alpha);
                }
            }
            ans.add(level);
        }
        return ans;
    }
}
