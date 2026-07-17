// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }
// public class Main
// {
// 	public static void main(String[] args) {
	    
// 	    Node head = new Node(10);
// 	    head.next = new  Node(20);
// 	    head.next.next =  new Node(30);
// 	    head.next.next.next = new Node(40);
// 	    Node curr = head;
// 	    int sum =0;
// 	    while(curr != null){
// 	      //  System.out.print(curr.data+" ");
	        
// 	        sum = sum + curr.data;
// 	        curr = curr.next;
// 	    }
// 	    System.out.print(sum);
// 	}
// }




//Adding the elements in the linkedlist with linked list framwork

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(10);
		list.add(11);
		list.add(20);
		list.add(30);
		list.add(40);
		int sum = 0;
		for(int a : list){
		    sum = sum + a;
		    
		}
		System.out.print(sum);
	}
}