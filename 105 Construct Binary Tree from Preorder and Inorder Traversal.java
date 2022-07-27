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
    public TreeNode buildTree(int[] preorder, int[] inorder,int inS,int inE,int preS, int preE) {
        if(inS>inE) {
            return null;
        }
        int rootdata=preorder[preS];
        TreeNode root=new TreeNode(rootdata);
        int rootindex=-1;
        for(int i=inS;i<=inE;i++) {
            if(inorder[i]==rootdata) {
                rootindex=i;
                break;
            }
        }
        int leftinS = inS;
        int leftinE = rootindex - 1;
        int leftpreS = preS + 1;
        int leftpreE = leftinE - leftinS + leftpreS;
        int rightinS = rootindex + 1;
        int rightinE = inE;
        int rightpreS = leftpreE + 1;
        int rightpreE = preE;
        
        root.left = buildTree(preorder, inorder, leftinS, leftinE, leftpreS, leftpreE);
        root.right = buildTree(preorder, inorder, rightinS, rightinE, rightpreS, rightpreE);
        
        return root;
        
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, inorder, 0, inorder.length-1, 0, preorder.length-1);
    }
}
