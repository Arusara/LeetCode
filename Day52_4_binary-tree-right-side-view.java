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
  
    public static int maxLevel=-1;
    public List<Integer> rightSideView(TreeNode root) {        
        List<Integer> result= recursive(new ArrayList<>(), root, 0);
        maxLevel=-1;
        return result;
    }
  
  
    public List<Integer> recursive(List<Integer> result, TreeNode root, int level) {
      
      if (root==null) {
        return result;
      }
      
      if (maxLevel<level) {
        result.add(root.val);
        maxLevel=level;
      }
      
      recursive(result, root.right, level+1);
      recursive(result, root.left, level+1);
      return result;
      
    }
}
