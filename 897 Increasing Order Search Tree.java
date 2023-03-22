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
    private void inorder(TreeNode root, List<Integer> values) {
        // Base case if root is null then return
        if(root == null) {
            return;
        }
        // call inorder helper function for the left subtree
        inorder(root.left, values);
        // adding the value to the list 
        values.add(root.val);
        // calling inorder helper function for the right subtree
        inorder(root.right, values);
    }
    public TreeNode increasingBST(TreeNode root) {
        // creating treenode ans to return the increasing order bst
        TreeNode ans = new TreeNode(0);
        List<Integer> values = new ArrayList();
        // calling inorder function for inorder traversal and to add the values in list
        inorder(root, values);
        TreeNode curr = ans;
        for(int i : values) {
            curr.right = new TreeNode(i);
            curr = curr.right;
        }
        return ans.right;
    }
}
