package Basic_Operations;
/* structure of list node:

class Node
{
    int data;
    Node next;
    Node(int val)
    {
        data=val;
        next=null;
    }
}

*/

class Solution {
    public Node findIntersection(Node head1, Node head2) {
        HashSet<Integer> set =new HashSet<>();
        Node temp = head2;
        while(temp != null){
            set.add(temp.data);
            temp = temp.next;
        }
        Node head = null;
        Node tail = null;
        Node temp1 = head1;
        while(temp1 != null){
            if(set.contains(temp1.data)){
                Node  newnode = new Node(temp1.data);
                
                if(head == null){
                    head = newnode;
                    tail = newnode;
                }else{
                    tail.next = newnode;
                    tail = newnode;
                }
            }
            temp1 = temp1.next;
            
        }
        return head;
    }
}



//160. Intersection of Two Linked Lists

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;

        while(a != b){
              
            a = a!=null?a.next = headB:a;
            b = b!= null?b.next = headA:b;
            //   if(a!=null){
            //     a.next = headB;
            //   }
            //   if(b != null){
            //     b.next = headA;
            //   }
        }
        return a;
        
    }
}