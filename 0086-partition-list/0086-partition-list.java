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
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode();
        ListNode right = new ListNode();
        ListNode Ltail= left;
        ListNode Rtail = right;
        ListNode p=head;
        while(p!=null){
            if(p.val<x){
                Ltail.next=p;
                Ltail=Ltail.next;
            }else{
                Rtail.next=p;
                Rtail=Rtail.next;
            }

                p=p.next; 
            
          
        }
        // left=left.next;
        Ltail.next=right.next;
        Rtail.next=null;
        return left.next;
    }
}