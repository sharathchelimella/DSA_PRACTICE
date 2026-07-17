package Basic_Operations;
//328. Odd Even Linked List

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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode odd = head;
        ListNode  even = head.next;
        ListNode evenhead = head.next;

        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenhead;

        return head;
        
    }
}


//Rearange the list


/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public void rearrangeEvenOdd(Node head) {
        if(head == null || head.next == null){
            return;
        }
        
        Node odd = head;
        Node even = head.next;
        Node evenhead = head.next;
        while(even != null && even.next != null){
            
            odd.next = even.next;
            odd = odd.next;
            
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenhead;
        
        
        
        
        
    }
}