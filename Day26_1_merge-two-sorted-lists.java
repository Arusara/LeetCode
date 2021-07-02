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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      
      
      ListNode listnode = new ListNode(0);
      
      ListNode temp = listnode;
      
      while(l1!=null || l2!=null) {
        
        if (l1==null&&l2==null) break;
        
        int value1 = l1==null ? Integer.MAX_VALUE : l1.val;
        int value2 = l2==null ? Integer.MAX_VALUE : l2.val;
        
        if (value1<value2) {
         ListNode node = new ListNode(value1);
         temp.next = node;
         temp=temp.next;
          if (l1!=null) l1 = l1.next;
        } else {
          
         ListNode node = new ListNode(value2);
         temp.next = node;
         temp=temp.next;
         if (l2!=null) l2 = l2.next;
          
        }
          
        
      }
      
      return listnode.next;
        
    }
}
