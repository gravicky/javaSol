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
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return mirror(root.right,root.left);
        
    }
    public boolean mirror(TreeNode right, TreeNode left){
        if(right == null && left == null)
            return true;
        if(right == null || left == null)
            return false;
        return (right.val==left.val) && mirror(left.right,right.left) && mirror(left.left,right.right);
    }
}