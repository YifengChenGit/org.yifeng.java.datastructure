package org.yifeng.java.datastructure.sets;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetWithComparable {

	public static void main(String[] args) {
		
		Set<Person> persons = new TreeSet<>();
		persons.add(new Person("Bob"));
		persons.add(new Person("Jason"));
		persons.add(new Person("Alex"));
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
