package linked_test_prep;

import java.util.LinkedList;

/**
 * Given three huge numbers, each represented using a linked list 
 * (where each node of a linked list represents a digit), 
 * calculate the sum of the numbers and return back the number in 
 * the form of a linked list. For example,  9->2->3, 4->6 and 2->5->1 
 * representing numbers 923, 46 and 251 respectively. The result 
 * should be 1->2->2->0. This can be solved using stacks.
 */

public class LinkedListAddThreeNums {

	public static void main(String[] args) { 
		LinkedList<Integer> l_list1 = new LinkedList<Integer>(); 
		LinkedList<Integer> l_list2 = new LinkedList<Integer>();
		LinkedList<Integer> l_list3 = new LinkedList<Integer>();
		
		l_list1.add(9);
		l_list1.add(4);
		l_list1.add(6);
		
		l_list2.add(4);
		l_list2.add(6);
		
		l_list3.add(2);
		l_list3.add(5);
		l_list3.add(1);
		
		int size_1 = l_list1.size();
		int size_2 = l_list2.size();
		int size_3 = l_list3.size();
		
		int l_list1_digits = (int) Math.pow(10, size_1);
		int l_list2_digits = (int) Math.pow(10, size_2);
		int l_list3_digits = (int) Math.pow(10, size_3);
		
		int num_1 = 0;
		for (int i = 0; i < size_1; i++) {
			l_list1_digits /= 10;
			num_1 = l_list1.get(i) * l_list1_digits + num_1;
		}
		
		int num_2 = 0;
		for (int i = 0; i < size_2; i++) {
			l_list2_digits /= 10;
			num_2 = l_list2.get(i) * l_list2_digits + num_2;
		}
		
		int num_3 = 0;
		for (int i = 0; i < size_3; i++) {
			l_list3_digits /= 10;
			num_3 = l_list3.get(i) * l_list3_digits + num_3;
		}
		
		int result = num_1 + num_2 + num_3;
		
		System.out.println(result);
	}

}
