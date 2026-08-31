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
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        ListNode prev = head;
        ListNode current = head.next;

        int position = 2;

        int firstCritical = -1;
        int prevCritical = -1;

        int minDistance = Integer.MAX_VALUE;

        while (current.next != null) {

            // Check whether current is a critical point
            boolean isMax = current.val > prev.val && current.val > current.next.val;
            boolean isMin = current.val < prev.val && current.val < current.next.val;

            if (isMax || isMin) {

                // First critical point
                if (firstCritical == -1) {
                    firstCritical = position;
                } 
                else {
                    // Distance from previous critical point
                    minDistance = Math.min(
                        minDistance,
                        position - prevCritical
                    );
                }

                // Update previous critical point
                prevCritical = position;
            }

            prev = current;
            current = current.next;
            position++;
        }

        // Fewer than 2 critical points
        if (firstCritical == -1 || firstCritical == prevCritical) {
            return new int[]{-1, -1};
        }

        // Maximum distance = last critical - first critical
        int maxDistance = prevCritical - firstCritical;

        return new int[]{minDistance, maxDistance};
    }
}