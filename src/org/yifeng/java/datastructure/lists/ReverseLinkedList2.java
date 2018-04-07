package org.yifeng.java.datastructure.lists;

public class ReverseLinkedList2 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.print();
		list.reverse();
		list.print();
	}
}

class Node<T> {
	
	T value;
	Node<T> next;
	
	Node(T value, Node<T> next) {
		this.value = value;
		this.next = next;
	}
}

class LinkedList<T> {
	
	Node<T> head;
	
	void add(T value) {
		head = new Node<>(value, head);
	}
	
	void reverse() {
		
		Node<T> newHead = null;
		Node<T> previousNewHead = null;
		
		while(head != null) {
			newHead = head;
			head = head.next;
			newHead.next = previousNewHead;
			previousNewHead = newHead;
		}
		
		head = previousNewHead;
	}
	
	void print() {
		Node<T> current = head;
		while (current != null) {
			System.out.print(current.value + " ");
			current = current.next;
		}
		System.out.println();
	}
}
