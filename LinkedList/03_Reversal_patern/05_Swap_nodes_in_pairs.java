//24. Swap Nodes in Pairs

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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode curr = head;
        ListNode prev = dummy;
        while(curr != null && curr.next != null){
            ListNode first = curr;
            ListNode second = curr.next;
            ListNode nextpair = second.next;

            prev.next = second;
            second.next = first;
            first.next = nextpair;

            curr = nextpair;
            prev = first;
        }
        return dummy.next;
        
    }
}