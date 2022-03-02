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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if(root==null)
            return list;
        Stack<TreeNode> stack=new Stack<>();
        TreeNode cur=root;
        while(!stack.empty() || cur!=null ){
            while(cur!=null){
                stack.add(cur);
                cur=cur.left;
            }
            cur=stack.pop();
            list.add(cur.val);
            cur=cur.right;
        }
        return list;
        
    }
}