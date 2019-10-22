package com.demo;



public class RemoveDuplicatesFromLinkedList {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int i){
			this.data=i;
			this.next=null;
		}
	}
	
	 void removefduplicates() {
		
		Node current=head;
		
		while(current!=null) {
			Node temp=current;
			while(temp!=null&&temp.data==current.data) {
				temp=temp.next;
			}
			current.next=temp;
			current=current.next;
		}
		
	}
	
	
	void removeDuplicates() 
	{ 
		Node curr = head; 

		while (curr != null) { 
			Node temp = curr; 
			while(temp!=null && temp.data==curr.data) { 
				temp = temp.next; 
			} 
			curr.next = temp; 
			curr = curr.next; 
		} 
	} 
	public static void main(String args[]) 
	{ 
		RemoveDuplicatesFromLinkedList list = new RemoveDuplicatesFromLinkedList(); 
		list.head = new Node(85); 
		list.head.next = new Node(15); 
		list.head.next.next = new Node(15); 
		list.head.next.next.next = new Node(20);
		list.head.next.next.next.next = new Node(21); 
		list.head.next.next.next.next.next = new Node(15); 

		
		System.out.println("List before removal of duplicates"); 
		//list.printList(); 
		
		list.removefduplicates(); 
		
		System.out.println("List after removal of elements"); 
		Node node=list.head;
		while(node!=null) {
			System.out.println(node.data);
			node=node.next;
		}
		//list.printList(); 
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoveDuplicatesFromLinkedList removeduplI=new RemoveDuplicatesFromLinkedList();
		removeduplI.head=new Node(1);
		removeduplI.head.next=new Node(2);
		removeduplI.head.next.next=new Node(1);
		removeduplI.removeDuplicates();
		Node node=removeduplI.head;
		while(node!=null) {
			System.out.println(node.data);
			node=node.next;
		}

	}*/

}
