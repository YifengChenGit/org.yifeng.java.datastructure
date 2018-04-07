package org.yifeng.java.datastructure.maps;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapWithComparable {

	public static void main(String[] args) {
		
		Map<Person, Integer> persons = new TreeMap<>();
		persons.put(new Person("Bob"), 0);
		persons.put(new Person("Jason"), 0);
		persons.put(new Person("Alex"), 0);
		System.out.println(persons);
	}
}

class Person implements Comparable<Person> {

	private String name;

	Person(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	@Override
	public int compareTo(Person person) {
		
		if (person == null || person.getName() == null ) {
			throw new IllegalArgumentException("person or person name is null");
		}
		
		return person.getName().compareTo(this.getName()) * (-1);
	}
	
	@Override
	public String toString() {
		return name;
	}
}
