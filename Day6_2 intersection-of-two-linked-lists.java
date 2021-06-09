/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
     
      int lengthA = getLength(headA);
      int lengthB = getLength(headB);
      
      ListNode temp1 = headA;
      ListNode temp2 = headB;
      
      if (lengthA>lengthB) {
        temp1 = skipList(headA, lengthA-lengthB);
        }
       else if(lengthB>lengthA) {
         temp2 = skipList(headB, lengthB-lengthA);
       }
      
      while(temp1!=null && temp2!=null) {
        
        if(temp1== temp2) {
          return temp1;
        }
        temp1= temp1.next;
        temp2 = temp2.next;
      }
      return temp1;
      
      
      
    }
  
  public static int getLength(ListNode node) {
    int result =0;
    ListNode temp = node;
    while(temp!=null) {
      result++;
      temp = temp.next;
    }
    return result;    
  }
  
  public static ListNode skipList(ListNode node, int k) {
    
    ListNode temp = node;
    
    for (int i=0;i<k;i++) {
      temp = temp.next;
    }
    return temp;
  }
}
