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
        List<List<Integer>> list=new ArrayList<>();
        backtrack(list,root,0);
        return list;
    }
    
    public void backtrack( List<List<Integer>> list,TreeNode root, int depth){
        if(root==null)
            return;
        if(depth>=list.size())
            list.add(new ArrayList<>());
            list.get(depth).add(root.val);
            backtrack(list,root.left,depth+1);
            backtrack(list,root.right,depth+1);
        
    }
}