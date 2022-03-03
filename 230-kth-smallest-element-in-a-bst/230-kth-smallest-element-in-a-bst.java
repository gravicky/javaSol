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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list=new ArrayList<>();
        backtrack(root, list);
        return list.get(k-1);
        }
    public void backtrack(TreeNode root,List<Integer> list){
        while(root!=null){
            backtrack(root.left,list);
            list.add(root.val);
            root=root.right;            
        }
        
    }
        
}