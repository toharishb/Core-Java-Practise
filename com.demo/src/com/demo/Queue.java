package com.demo;


public class Queue {
	
	
	public Node FRONT;
	public Node REAR;
	
	
	public Queue() {
		FRONT=null;
		REAR=null;
	}
	
	public void add(int a) {
		Node newNode=new Node(a);
		if(FRONT==null) {
			FRONT=newNode;
		}
		else {
			REAR.next=newNode;
		}
		REAR=newNode;
	}
	
	public int remove() {
		int temp = FRONT.i;
		  // If no node left after deleting node
		  if(FRONT.next == null){
		   REAR = null;
		  }
		  // front starts pointing to next element
		  FRONT = FRONT.next;
		  return temp;
	}
	
	public void traverse() {
		while(FRONT != null){
			FRONT.displayData();
			FRONT = FRONT.next;
			  }
	}
	
}
class Node{
	  //data
	  int i;
	  Node next;
	  Node(int i){
	   this.i = i;
	  }
	  public void displayData(){
	   System.out.println("i= " + i);
	  }
	 }