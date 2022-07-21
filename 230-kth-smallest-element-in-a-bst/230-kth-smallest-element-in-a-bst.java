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
        Stack<TreeNode> st = new Stack<>();
        int i=0;
        back(root,st);
        while(!st.isEmpty()){
            i++;
            TreeNode ret  = st.pop();
            if(i == k)
                return ret.val;
            back(ret.right,st);
            
        }
return -1;
    }
    public void back(TreeNode root, Stack<TreeNode> st){
        while(root!=null){
            st.add(root);
            root = root.left;
        }
    }
}