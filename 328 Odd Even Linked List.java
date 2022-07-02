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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) {
            return head;
        }
        int count=1;
        ListNode evenHead=null, evenTail=null, oddHead=null, oddTail=null;
        while(head!=null) {
            if(count%2==0) {
                if(evenHead==null && evenTail==null) {
                    evenHead=head;
                    evenTail=head;
                }else {
                    evenTail.next=head;
                    evenTail=head;
                }
            }else {
                if(oddHead==null && oddTail==null) {
                    oddHead=head;
                    oddTail=head;
                }else {
                    oddTail.next=head;
                    oddTail=head;
                }
            }
            count++;
            
            head=head.next;
        }
        
        if(oddHead==null) {
            return evenHead;
        }else if(evenHead==null) {
            return oddHead;
        }else {
            oddTail.next=evenHead;
            evenTail.next=null;
            return oddHead;
        }
    }
}
