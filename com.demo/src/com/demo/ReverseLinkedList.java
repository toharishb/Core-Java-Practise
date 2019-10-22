package com.demo;

public class ReverseLinkedList {
	
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int i){
			this.data=i;
			this.next=null;
		}
		
	}
	static Node reverseList(Node node) {
		
		Node prev=null;
		Node current=node;
		Node next=null;
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		node=prev;
		
		return node;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseLinkedList rl=new ReverseLinkedList();
		rl.head=new Node(1);
		rl.head.next=new Node(2);
		rl.head.next.next=new Node(3);
		
		Node result=reverseList(head);
		while(result!=null) {
			System.out.println(result.data);
			result=result.next;
		}
		

	}

}
