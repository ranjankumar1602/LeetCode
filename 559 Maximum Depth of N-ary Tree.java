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
    public int maxDepth(Node root) {
        if(root==null) {
            return 0;
        }
        if(root.children.size()==0) {
            return 1;
        }
        int temp=0,depth=0;
        for(int i=0;i<root.children.size();i++) {
            temp=maxDepth(root.children.get(i));
            if(temp>depth) {
                depth=temp;
            }
        }
        return depth+1;
    }
}
