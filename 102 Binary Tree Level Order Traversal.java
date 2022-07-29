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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) {
            return ans;
        }
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size=queue.size();
            List<Integer> templist= new ArrayList<Integer>();
            while(size>0) {
                TreeNode tempnode=queue.poll();
                templist.add(tempnode.val);
                if(tempnode.left!=null) {
                    queue.add(tempnode.left);
                }
                if(tempnode.right!=null) {
                    queue.add(tempnode.right);
                }
                size--;
            }
            ans.add(templist);
        }
        return ans;
    }
}
