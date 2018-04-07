package org.yifeng.java.datastructure.lists;

import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		List<Integer> reversedList = reverseLinkedList(list);
		System.out.println(reversedList);
	}
	
	private static List<Integer> reverseLinkedList(List<Integer> list) {
		List<Integer> reversedList = new LinkedList<>();
		list.forEach(e -> reversedList.add(0, e));
		return reversedList;
	}
}
