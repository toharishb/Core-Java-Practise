package data.structures;

public class LinkedListReverse {
	
	
	public static Node head;
	
	/*class Node{
		
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
		
	}*/
	
	static Node ReverseList(Node head) {
		Node current=head;
		Node prev=null;
		Node next=null;
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListReverse rl=new LinkedListReverse();
		rl.head=new Node(5);
		rl.head.next=new Node(6);
		rl.head.next.next=new Node(7);
		head=ReverseList(head);
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}

	}

}
