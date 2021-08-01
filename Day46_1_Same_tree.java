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
    public boolean isSameTree(TreeNode p, TreeNode q) {
      return isSameRec(p,q);  
    }
  
  
  public boolean isSameRec(TreeNode first, TreeNode second) {
    
    if (first==null && second==null) return true;
    
    if(first==null || second==null) return false;
    
    if(first.val!=second.val) return false;
  
    return isSameRec(first.left, second.left) && isSameRec(first.right, second.right);
  }
  
  
   
}
