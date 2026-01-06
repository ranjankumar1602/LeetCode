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
    public void dfs(TreeNode node, List<Integer> sumOfLevel, int level) {
        if(node == null) {
            return;
        }
        if(sumOfLevel.size() == level) {
            sumOfLevel.add(node.val);
        }else {
            sumOfLevel.set(level, sumOfLevel.get(level) + node.val);
        }

        dfs(node.left, sumOfLevel, level + 1);
        dfs(node.right, sumOfLevel, level + 1);
    }

    
    public int maxLevelSum(TreeNode root) {
        List<Integer> sumOfLevel = new ArrayList<>();
        dfs(root, sumOfLevel, 0);

        int sum = Integer.MIN_VALUE;
        int ans = 0;
        for(int i = 0; i < sumOfLevel.size(); i++) {
            if(sum < sumOfLevel.get(i)) {
                sum = sumOfLevel.get(i);
                ans = i + 1;
            }
        }
        return ans;
    }
}
