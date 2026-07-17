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