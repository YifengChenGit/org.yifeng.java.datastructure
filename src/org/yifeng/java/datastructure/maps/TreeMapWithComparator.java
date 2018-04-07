package org.yifeng.java.datastructure.maps;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapWithComparator {

	public static void main(String[] args) {

		Map<Person, Integer> persons = new TreeMap<>(new PersonComparator());
		persons.put(new Person("Bob"), 0);
		persons.put(new Person("Jason"), 0);
		persons.put(new Person("Alex"), 0);
		System.out.println(persons);
	}
}

class PersonComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

class Person1 {

	private String name;

	Person1(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}
}
