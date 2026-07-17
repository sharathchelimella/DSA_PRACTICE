package Basic_Operations;
/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        
        
        if(head== null){
            return head;
            
        }
        if(x == 1){
            return head.next;
        }
        
        
        Node temp = head;
        for(int i = 1; i  < x-1 && temp != null; i++){
            temp = temp.next;
        }
        
        if(temp == null || temp.next == null){
            return head;
        }
        
        temp.next = temp.next.next;
        return head;
        
        
    }
}



//19. Remove Nth Node From End of List


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int count = 0;
        ListNode temp = head;
        
        
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int skip = count-n+1;
        
        ListNode temp1 = head;
        if(head == null){
            return head;
        }
        if(skip == 1){
            return temp1.next;
        }
        

        for(int i = 1; i <skip-1 && temp1 != null; i++){
            temp1 = temp1.next;
        }

        if(temp1.next == null || temp1 == null){
            return head;
        }
        
        temp1.next = temp1.next.next;
        return head;
    }
}