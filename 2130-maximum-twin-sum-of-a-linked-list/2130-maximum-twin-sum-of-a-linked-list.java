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
    public int pairSum(ListNode head) {
        int max = 0;
        
        ListNode dummy = Middle(head);
        ListNode reverse = Reverse(dummy.next);

        dummy.next = null;

        ListNode first = head;
        ListNode second = reverse;

      

        while(first != null && second != null){
            int twovalue  = first.val + second.val;
            max = Math.max(max , twovalue);
            first = first.next;
            second = second.next;
  
        }

        return max;

        
        
    }

    public ListNode Reverse(ListNode head){
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        while(temp != null){
            st.push(temp.val);
            temp = temp.next;
        }

        temp = head;
        while(temp != null){
            temp.val = st.pop();
            temp = temp.next;
        }

        return head;

    }

    public ListNode Middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    return slow;
    }
}