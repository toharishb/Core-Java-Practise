package data.structures;

//Java program for reversing the linked list 

class ReverseLinkedList { 

	static Node head; 

	 

	Node reverseHead(Node node) 
	{ 
		Node prev = null; 
		Node current = node; 
		Node next = null; 
		while (current != null) { 
			next = current.next; 
			current.next = prev; 
			prev = current; 
			current = next; 
		} 
		node = prev; 
		return node; 
	} 

	void printLinkedList(Node node) 
	{ 
		while (node != null) { 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
	} 

	public static void main(String[] args) 
	{ 
		ReverseLinkedList list = new ReverseLinkedList(); 
		list.head = new Node(85); 
		list.head.next = new Node(15); 
		list.head.next.next = new Node(4); 
		list.head.next.next.next = new Node(20); 

		System.out.println("Given LinkedList"); 
		list.printLinkedList(head); 
		head = list.reverseHead(head); 
		System.out.println(""); 
		System.out.println("Reversed LinkedList "); 
		list.printLinkedList(head); 
	} 
} 
