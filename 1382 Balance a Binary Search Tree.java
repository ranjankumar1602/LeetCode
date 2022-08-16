/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void inorder(ArrayList<TreeNode> list, TreeNode root) {
        if(root == null) {
            return;
        }
        inorder(list,root.left);
        list.add(root);
        inorder(list,root.right);
        return;
    }
    
    public TreeNode bst(ArrayList<TreeNode> list, int start, int end) {
        if(start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode root = list.get(mid);
        root.left = bst(list, start, mid - 1);
        root.right = bst(list, mid + 1, end);
        return root;
    }
    
    public TreeNode balanceBST(TreeNode root) {
        if(root == null) {
            return null;
        }
        ArrayList<TreeNode> list = new ArrayList<>();
        inorder(list, root);
        return bst(list, 0, list.size() - 1);
    }
}
