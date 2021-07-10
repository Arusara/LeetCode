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
    public ListNode deleteDuplicates(ListNode head) {
      
      ListNode firstNode = head;
      ListNode secondNode = head;
      
      while (secondNode!=null && secondNode.next!=null) {
        
        secondNode = secondNode.next;
        
        // remove duplicates here.
        if (firstNode.val == secondNode.val) {
          firstNode.next = secondNode.next;
          continue;
        }
        
        firstNode = firstNode.next;
      }
      
      return head;
        
    }
}
