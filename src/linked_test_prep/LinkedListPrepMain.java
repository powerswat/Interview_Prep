package linked_test_prep;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPrepMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l_list = new LinkedList<Integer>();
		
		l_list.add(2);
		l_list.add(4);
		l_list.add(1);
		l_list.add(3);
		
		System.out.println("Iterator");
		ListIterator<Integer> l_it = l_list.listIterator();
		while(l_it.hasNext()){
			System.out.println(l_it.next());
		}
		
		System.out.println("For Loop");
		for (int i = 0; i < l_list.size(); i++) {
			System.out.println(l_list.get(i));
		}
		
		System.out.println("Done");
		int a = 1;
	}

}
