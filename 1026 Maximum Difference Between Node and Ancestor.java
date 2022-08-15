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
    private int maxAncestorDiff(TreeNode root, int min, int max) {
        if(root == null) {
            return max - min;
        }
        if(root.val < min) {
            min = root.val;
        }
        if(root.val > max) {
            max = root.val;
        }
        return Math.max(maxAncestorDiff(root.left, min, max), maxAncestorDiff(root.right, min, max));
    }
    
    public int maxAncestorDiff(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return maxAncestorDiff(root, root.val, root.val);
    }
}
