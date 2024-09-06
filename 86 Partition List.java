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
        // create two linked list to iraverse add value < x and >= x;
        ListNode first = new ListNode(0);
        ListNode second = new ListNode(0);
        // tail to keep pointer of head safe and add data using tail
        ListNode firstTail = first;
        ListNode secondTail = second;

        while(head != null) {
            if(head.val < x) {
                firstTail.next = head;
                firstTail = firstTail.next;
            }else {
                secondTail.next = head;
                secondTail = secondTail.next;
            }
            head = head.next;
        }
        firstTail.next = second.next;
        secondTail.next = null;

        return first.next;
    }
}
