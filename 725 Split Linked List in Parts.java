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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int count = 0;
        ListNode current = head;
        while(current != null) {
            count++;
            current = current.next;
        }
        ListNode[] ans = new ListNode[k];
        int rem = count % k;
        int partsLen = count / k;
        current = head;
        ListNode prev = null;
        for(int i = 0; current != null && i < k; i++, rem--) {
            ans[i] = current;
            for(int j = 0; j < partsLen + (rem > 0 ? 1 : 0); j++) {
                prev = current;
                current = current.next;
            }
            prev.next = null;
        }
        return ans;
    }
}
