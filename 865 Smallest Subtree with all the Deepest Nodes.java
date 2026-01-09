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
    int deepLevel = 0;
    TreeNode ans = null;

    private int dfs(TreeNode root, int level) {
        if(root == null) {
            return level;
        }
        int leftL = dfs(root.left, level + 1);
        int rightL = dfs(root.right, level + 1);

        int currL = Math.max(leftL, rightL);
        deepLevel = Math.max(deepLevel, currL);

        if(leftL == deepLevel && rightL = deepLevel) {
            ans = root;
        }

        return currL;
    }
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        dfs(root, 0);
        return ans;
    }
}
