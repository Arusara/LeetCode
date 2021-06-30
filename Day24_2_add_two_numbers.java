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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      
      
      int carry = 0;
      
      ListNode list = new ListNode(0);
      
      ListNode curr = list;
      
      while(l1!=null || l2!=null) {
        
        int value1 = l1==null ? 0 : l1.val;
        int value2 = l2==null ? 0 : l2.val;
        int sum = value1 + value2+carry;
        
        carry = sum/10;
        sum = sum%10;
        
        ListNode listnode = new ListNode(sum);
        curr.next = listnode;
        curr = listnode;
        
        if(l1!=null) l1 = l1.next;
        if(l2!=null) l2 = l2.next;
      }
      
      if (carry==1) {
        curr.next = new ListNode(1);
      }
      
      return list.next;
        
    }
        
}
