//92 Reverse_linkedlist 2

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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevleft = dummy;
        for(int i = 0; i < left-1; i++){
            prevleft = prevleft.next;
        }
        ListNode prev = prevleft;
        ListNode curr = prevleft.next;
        for(int i = 0; i <= right-left; i++){
            ListNode next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        ListNode  prevNext = prevleft.next;
        prevNext.next = curr;
        prevleft.next = prev;
        return dummy.next;
    }
}
