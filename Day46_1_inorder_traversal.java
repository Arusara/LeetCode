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
        
      return inorder(root, new ArrayList<>());
    }
  
  
    public List<Integer> inorder(TreeNode root, List<Integer> result) {
      
      if (root==null) {
        return result;
      }
      
      inorder(root.left, result);
      result.add(root.val);
      inorder(root.right, result);
      return result;
    
    }
}
