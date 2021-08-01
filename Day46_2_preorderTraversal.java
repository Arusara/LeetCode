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
    public List<Integer> preorderTraversal(TreeNode root) {
      
      
      return preOrder(root, new ArrayList<>());
        
    }
  
  
    public List<Integer> preOrder(TreeNode root, List<Integer> result) {
      
      if (root==null) return result;
      
      result.add(root.val);
      
      preOrder(root.left, result);
      preOrder(root.right, result);
      return result;
    }
}
