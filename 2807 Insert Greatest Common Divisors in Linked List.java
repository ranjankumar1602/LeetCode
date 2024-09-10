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
    private int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null) {
            return head;
        }
        ListNode temp1 = head;
        ListNode temp2 = head.next;
        while(temp2 != null) {
            int gcdVal = gcd(temp1.val, temp2.val);
            ListNode gcdNode = new ListNode(gcdVal);
            temp1.next = gcdNode;
            gcdNode.next = temp2;

            temp1 = temp2;
            temp2 = temp2.next;
        }
        return head;
    }
}
