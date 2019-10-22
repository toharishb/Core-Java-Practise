package data.structures;

import java.util.LinkedList;

public class LinkedListSort {
	//BubbleSort
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(3);
		ll.add(4);
		ll.add(2);
		ll.add(1);
		ll.add(5);

		sortLinkedList(ll);

	}
	public static void sortLinkedList(LinkedList<Integer> ll) {
		int pass = 1;
		int temp;
		// for each pass
		while (pass < ll.size()) {
			for (int j = 0; j <=ll.size() - 1 - pass; j++) {
				if (ll.get(j)> ll.get(j+1)) {
					temp = ll.get(j);
					ll.set(j, ll.get(j+1));
					ll.set(j+1, temp);
				}
			}
			pass++;
		}

		for (int item : ll) {
			System.out.print(item + "  ");
		}
		System.out.println();
	}


}
