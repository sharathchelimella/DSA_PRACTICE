//142. Linked List Cycle II

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;
        if(head == null || head.next == null){
            return null;
        }
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                slow = head;
                break;
            }
        }
        if(fast == null || fast.next == null){
            return null;
        }

        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}