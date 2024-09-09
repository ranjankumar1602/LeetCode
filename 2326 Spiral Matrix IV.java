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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int i = 0, j = 0, currDir = 0;
        int[][] move = {
            {0, 1},
            {1, 0},
            {0, -1},
            {-1, 0},
        };
        int [][] result = new int[m][n];
        for(int[] row : result) {
            Arrays.fill(row, -1);
        }
        while(head != null) {
            result[i][j] = head.val;
            int newI = i + move[currDir][0];
            int newJ = j + move[currDir][1];
            
            if(Math.min(newI, newJ) < 0 || newI >=m || newJ >= n || result[newI][newJ] != -1) {
                currDir = (currDir + 1) % 4;
            }
            i += move[currDir][0];
            j += move[currDir][1];

            head = head.next;
        }
        return result;
    }
}
