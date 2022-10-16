/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return head;
        }
        // find if it is having cycle if not then return last node of linkedlist
        
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                ListNode first =head;
                ListNode second = slow;
                while(second!=first){
                    first=first.next;
                    second=second.next;
                    
                }
                return first;
            }
        }
        
      return null;
         
    }
    
    
}