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
    private void inorderTraversal(TreeNode root, Queue<Integer> queue) {
        // Base case if the root is null then retun
        if(root == null) {
            return;
        }
        // Calling for the left subtree
        inorderTraversal(root.left, queue);
        // adding the value in the queue
        queue.add(root.val);
        // calling the right subtree
        inorderTraversal(root.right, queue);
    }
    
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        // Creating an arraylist to return the answer
        List<Integer> ans = new ArrayList<Integer>();
        // creating two queue to store the inorder traversal or the roots 
        // Inorder Traversal is used to traverse BST in Ascending or Decending order
        Queue<Integer> item1 = new LinkedList<Integer>();
        Queue<Integer> item2 = new LinkedList<Integer>();
        // calling the inorder traversal function for root1 to store in queue
        inorderTraversal(root1, item1);
        // calling the inorder traversal function for root2 to store in queue
        inorderTraversal(root2, item2);
        // adding the sorted elements from both queue to the ans arraylist
        while(!item1.isEmpty() || !item2.isEmpty()) {
            if(item1.isEmpty()) {
                ans.add(item2.poll());
            }else if(item2.isEmpty()) {
                ans.add(item1.poll());
            }else {
                if(item1.peek() < item2.peek()) {
                    ans.add(item1.poll());
                }else {
                    ans.add(item2.poll());
                }
            }
        }
        return ans;
    }
}
