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
      
      List<Integer> list = new ArrayList<>();
      
      TreeNode curr = root;
      Stack<TreeNode> stack = new Stack<>();
      while(curr!=null || !stack.isEmpty()) {
        
        while(curr!=null) {
          stack.push(curr);
          list.add(curr.val);
          curr = curr.left;
        }
        
        curr = stack.pop();
        curr = curr.right; 
      }
      return list;
      
     
    }
}
