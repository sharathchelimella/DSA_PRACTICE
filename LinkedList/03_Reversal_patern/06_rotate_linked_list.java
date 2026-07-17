

//rotate linked list 61 in leet code

//Brute Force

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
    public ListNode rotateRight(ListNode head, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        if(head == null || head.next == null){
            return head;
        }
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;  
        }
        int n = list.size();
        k = k%n;
        reverse(list, 0,n-1);
        reverse(list, 0, k-1);
        reverse(list, k,n-1);
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for(int num : list){
            curr.next = new ListNode(num);
            curr = curr.next;
        } 
        return dummy.next;
    }
    public void reverse(ArrayList<Integer> list,int i,int j){
        while(i < j){
            int temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }
}



//Optimal solutions

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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        int len = 1;
        while(temp.next != null){
            temp = temp.next;
            len++;
        }

        k = k%len;
        while(k != 0){
            ListNode temp1 = head;
            while(temp1.next.next != null){
                temp1 = temp1.next;
            }
            ListNode last = temp1.next;
            temp1.next = null;
            last.next = head;
            head = last;

            k--;
        }
        return head;
    }
}


//optimal

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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k==0){
            return head;
        }
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        k = k%len;
        if(k == 0){
            return head;
        }
        int rotate = len - k;
        int count = 1;
        temp = head;
        while(count != rotate){
            count++;
            temp = temp.next;
        }
        ListNode newhead = temp.next;
        ListNode temp2 = newhead;
        temp.next = null;
        while(temp2.next != null){
            temp2 = temp2.next;
        }
        temp2.next = head;
        return newhead;
    }
}


//more optimal

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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k==0){
            return head;
        }
        ListNode temp = head;
        int len = 1;
        while(temp.next != null){
            len++;
            temp = temp.next;
        }
        
        
        k = k%len;
        int rotate = len - k;
        if(k== 0){
            return head;
        }
        temp.next = head;
        while(rotate != 0){
            temp = temp.next;
            rotate--;
        }
        ListNode newhead  = temp.next;
        temp.next = null;
        return newhead;
        
    }
}