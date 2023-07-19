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
class FindElements {
    private Set<Integer> visited = new HashSet<>();

    private void FindElements(TreeNode root, int data) {
        if(root == null) {
            return;
        }
        visited.add(data);
        root.val = data;
        FindElements(root.left, 2 * data + 1);
        FindElements(root.right, 2 * data + 2);
    }

    public FindElements(TreeNode root) {
        FindElements(root, 0);
    }
    
    public boolean find(int target) {
        return visited.contains(target);
    }
}
/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */
