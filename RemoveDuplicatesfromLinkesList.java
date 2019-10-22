package data.structures;

// Java program to remove duplicates from a sorted linked list 
class RemoveDuplicatesfromLinkesList 
{ 
	Node head; // head of list 

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
					
	
	void printList() 
	{ 
		Node temp = head; 
		while (temp != null) 
		{ 
			System.out.print(temp.data+" "); 
			temp = temp.next; 
		} 
		System.out.println(); 
	} 

	public static void main(String args[]) 
	{ 
		RemoveDuplicatesfromLinkesList list = new RemoveDuplicatesfromLinkesList(); 
		list.head = new Node(85); 
		list.head.next = new Node(15); 
		list.head.next.next = new Node(15); 
		list.head.next.next.next = new Node(20);
		list.head.next.next.next.next = new Node(21); 
		list.head.next.next.next.next.next = new Node(21); 

		
		System.out.println("List before removal of duplicates"); 
		list.printList(); 
		
		list.removeDuplicates(); 
		
		System.out.println("List after removal of elements"); 
		list.printList(); 
	} 
} 
