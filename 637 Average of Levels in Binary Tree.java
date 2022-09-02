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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        List<Double> ans = new ArrayList<Double>();
        while(!queue.isEmpty()) {
            int count = queue.size();
            double sum = 0;
            for(int i = 0; i < count; i++) {
                TreeNode node = queue.peek();
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
                sum += node.val;
                queue.poll();
            }
            ans.add(sum/count);
        }
        return ans;
    }
}
