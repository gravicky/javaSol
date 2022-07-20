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
        List<Integer> list = new ArrayList<>();
        if(root == null)
            return list;
        Stack<TreeNode> stack = new Stack<>();
        pushleft(root,stack);
        while(!stack.isEmpty()){
            TreeNode va = stack.pop();
            list.add(va.val);
            pushleft(va.right,stack);
        }
        return list;
        
    }
    public void pushleft(TreeNode node, Stack<TreeNode> stack){
        while(node!=null){
            stack.add(node);
            node = node.left;
        }
    }
}