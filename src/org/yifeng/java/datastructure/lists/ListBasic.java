package org.yifeng.java.datastructure.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Maps: ArrayList, LinkedList
 * 
 * Time Complexity:
 * +----------------+-----------+-----------+-----------+-----------+
 * |                |    Add    |   Remove  |    Get    |  Contains |
 * +----------------+-----------+-----------+-----------+-----------+
 * |    ArrayList   |    O(1)   |    O(n)   |    O(1)   |    O(n)   |
 * +----------------+-----------+-----------+-----------+-----------+
 * |    LinkedList  |    O(1)   |    O(1)   |    O(n)   |    O(n)   |
 * +----------------+-----------+-----------+-----------+-----------+
 */
public class ListBasic {

	public static void main(String[] args) {

		List<Integer> arrayList = createArrayList();
		System.out.println(arrayList);
		
		List<Integer> linkedList = createLinkedList();
		System.out.println(linkedList);
	}
	
	private static List<Integer> createArrayList() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		return list;
	}
	
	private static List<Integer> createLinkedList() {
		List<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		return list;
	}
}
