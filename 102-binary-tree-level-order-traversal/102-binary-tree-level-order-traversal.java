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
        Map<Integer,ArrayList<Integer>> map=new HashMap<>();
        backtrack(map,root,0);
        List<List<Integer>> list=new ArrayList<>();
        for (Integer key: map.keySet()){  
			list.add(map.get(key));
        }
        return list;
    }
    
    public void backtrack( Map<Integer,ArrayList<Integer>> map,TreeNode root, int depth){
        if(root!=null){
            ArrayList<Integer> lis=map.getOrDefault(depth,new ArrayList<>()); 
            lis.add(root.val); 
            map.put(depth,lis);
            backtrack(map,root.left,depth+1);
            backtrack(map,root.right,depth+1);
        }
        return;
        
    }
}