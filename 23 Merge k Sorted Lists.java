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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) {
            return null;
        }
        PriorityQueue<ListNode> queue = new PriorityQueue<>((o1,o2)->o1.val-o2.val);
        ListNode tail = new ListNode(-1);
        ListNode head = tail;
        for(ListNode list:lists) {
            while(list != null) {
                queue.add(list);
                list = list.next;
            }
        }
        while(!queue.isEmpty()) {
            tail.next = queue.poll();
            tail = tail.next;
            tail.next = null;
            
        }
        return head.next;
    }
}
