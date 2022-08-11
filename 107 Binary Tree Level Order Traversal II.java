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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> newList = new ArrayList<Integer>();
            for(int i = 0; i < size; i++) {
                TreeNode newNode = queue.poll();
                newList.add(newNode.val);
                if(newNode.left != null) {
                    queue.add(newNode.left);
                }
                if(newNode.right != null) {
                    queue.add(newNode.right);
                }
            }
            list.add(0,newList);
        }
        return list;
    }
}
