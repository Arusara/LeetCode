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
    public List<Integer> postorder(Node root) {
        return postOrderRec(root, new ArrayList<>());
    }
  
  
    public List<Integer> postOrderRec(Node root, List<Integer> result) {
  
      if (root==null) {
        return result;
      }
      List<Node> children = root.children;
    
      for(Node child:children) {
        postOrderRec(child, result);
      }
      result.add(root.val);
      return result;
   
    }
}
