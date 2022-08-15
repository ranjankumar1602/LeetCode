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
    private int goodNodes(TreeNode root, int max) {
        if(root == null) {
            return 0;
        }
        max = Math.max(max, root.val);
        if(root.val >= max) {
            return goodNodes(root.left,max) + goodNodes(root.right, max) + 1;
        }else {
            return goodNodes(root.left,max) + goodNodes(root.right, max);
        }
    }
    
    public int goodNodes(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return goodNodes(root, root.val);
    }
}
