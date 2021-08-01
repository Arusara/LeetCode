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
    public List<Integer> postorderTraversal(TreeNode root) {
      
      return postOrder(root, new ArrayList<>());
        
    }
  
    public List<Integer> postOrder(TreeNode root, List<Integer> result) {
      
      if (root==null) return result;
      
      postOrder(root.left, result);
      postOrder(root.right,result);
      result.add(root.val);
      return result;
    }
}
