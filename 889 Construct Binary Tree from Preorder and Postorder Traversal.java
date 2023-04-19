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
    int preIdx = 0;
    int postIdx = 0;
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        TreeNode root = new TreeNode(preorder[preIdx++]);
        if(root.val != postorder[postIdx]) {
            root.left = constructFromPrePost(preorder, postorder);
        }
        if(root.val != postorder[postIdx]) {
            root.right = constructFromPrePost(preorder, postorder);
        }
        postIdx++;
        return root;
    }
}
