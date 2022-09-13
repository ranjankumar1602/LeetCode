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
    private void binaryTreePaths(TreeNode root, String ans, List<String> list) {
        if(root.left == null && root.right == null) {
            list.add(ans + root.val);
        }
        if(root.left != null) {
            binaryTreePaths(root.left, ans + root.val + "->", list);
        }
        if(root.right != null) {
            binaryTreePaths(root.right, ans + root.val + "->", list);
        }
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        if(root != null) {
            binaryTreePaths(root, "", list);
        }
        return list;
    }
}
