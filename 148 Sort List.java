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
    private ListNode middle(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode slow=head, fast=head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    private ListNode mergeList(ListNode head1, ListNode head2) {
        if(head1 == null) {
            return head2;
        }
        if(head2 == null) {
            return head1;
        }
        
        ListNode temp1=head1, temp2=head2, head=null, tail=null;
        
        if(temp1.val <= temp2.val) {
            head = temp1;
            tail = temp1;
            temp1 = temp1.next;
        }else {
            head = temp2;
            tail = temp2;
            temp2 = temp2.next;
        }
        while(temp1 != null && temp2 != null) {
            if(temp1.val <= temp2.val) {
                tail.next = temp1;
                tail = temp1;
                temp1 = temp1.next;
                
            }else {
                tail.next = temp2;
                tail = temp2;
                temp2 = temp2.next;
            }
        }
        if(temp1 == null) {
            tail.next = temp2;
        }
        if(temp2 == null) {
            tail.next = temp1;
        }
        
        return head;
        
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) {
            return head;
        }
        
        ListNode mid = middle(head);
        ListNode newMid = mid.next;
        mid.next = null;
        ListNode part1 = sortList(head);
        ListNode part2 = sortList(newMid);
        ListNode merge = mergeList(part1,part2);
        
        return merge;
        
    }
}
