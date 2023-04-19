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
    private TreeNode constructMaximumBinaryTree(int nums[], int start, int end) {
        // Base case
        if(start > end) {
            return null;
        }
        int max = start;
        for(int i = start; i <= end; i++) {
            if(nums[i] > nums[max]) {
                max = i;
            }
        }
        TreeNode root = new TreeNode(nums[max]);
        root.left = constructMaximumBinaryTree(nums, start, max - 1);
        root.right = constructMaximumBinaryTree(nums, max + 1, end);
        return root;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree(nums, 0, nums.length - 1);
    }
}
