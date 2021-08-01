/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
      
     return preOrderRecursive(root, new ArrayList<>());
        
    }
  
    public List<Integer> preOrderRecursive(Node root, List<Integer> result) {
      
      if (root==null) return result;
      
      
       result.add(root.val);
      
      List<Node> childrens = root.children;
      
      for(Node child: childrens) {
        preOrderRecursive(child, result);
      }
      return result;
      
    }
}
