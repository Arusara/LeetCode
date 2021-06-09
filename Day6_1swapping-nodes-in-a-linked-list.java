/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
      
      if (head==null) {
        return head;
      }
      
      ListNode temp = head;
      ListNode first = head;
      ListNode second = head;
      
      
      for (int i=1;i<k;i++){
        temp = temp.next;
        first = first.next;
      }
      
      while (temp.next!=null) {
        temp = temp.next;
        second = second.next;
      }
      
      // swap.
      
      int tempVal = first.val;
      first.val = second.val;
      second.val = tempVal;
      
      return head;    
    }
}
