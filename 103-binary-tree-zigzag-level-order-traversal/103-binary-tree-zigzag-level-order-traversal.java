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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        backtrack(list,root,0);
        return list;
        
    }
    
    public void backtrack(List<List<Integer>>list,TreeNode root, int height){
        if(root==null)
            return;
         if(list.size() <= height)
        {
            List<Integer> newLevel = new ArrayList<>();
            list.add(newLevel);
        }
        if(height%2==0)
            list.get(height).add(root.val);
        else
            list.get(height).add(0,root.val);
        backtrack(list,root.left,height+1);
        backtrack(list,root.right,height+1);
    }
}