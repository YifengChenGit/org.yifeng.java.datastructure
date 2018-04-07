package org.yifeng.java.datastructure.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Sets: HashSet, LinkedHashSet, TreeSet
 * 
 * Features: no duplicate elements
 * 
 * Orders:
 *   - HashSet: no order
 *   - LinkedHashSet: insertion order
 *   - TreeSet: nature order by default, can be overridden by Comparable
 * 
 * Time Complexity:
 * +----------------+-----------+-----------+-----------+
 * |                |     Add   |   Remove  |  Contains |
 * +----------------+-----------+-----------+-----------+
 * |  HashSet       |     O(1)  |    O(1)   |    O(1)   |
 * +----------------+-----------+-----------+-----------+
 * |  LinkedHashSet |     O(1)  |    O(1)   |    O(1)   |
 * +----------------+-----------+-----------+-----------+
 * |  TreeSet       |  O(log n) |  O(log n) |  O(log n) |
 * +----------------+-----------+-----------+-----------+
 */
public class SetBasic {

	public static void main(String[] args) {

		Set<Integer> hashSet = createHashSet();
		System.out.println(hashSet);
		
		Set<Integer> linkedHashSet = createLinkedHashSet();
		System.out.println(linkedHashSet);
		
		Set<Integer> treeSet = createTreeSet();
		System.out.println(treeSet);
	}
	
	private static Set<Integer> createHashSet() {
		Set<Integer> set = new HashSet<>();
		set.add(0);
		set.add(2);
		set.add(3);
		set.add(1);
		set.add(1);
		return set;
	}
	
	private static Set<Integer> createLinkedHashSet() {
		Set<Integer> set = new LinkedHashSet<>();
		set.add(0);
		set.add(2);
		set.add(3);
		set.add(1);
		set.add(1);
		return set;
	}
	
	private static Set<Integer> createTreeSet() {
		Set<Integer> set = new TreeSet<>();
		set.add(0);
		set.add(2);
		set.add(3);
		set.add(1);
		set.add(1);
		return set;
	}
}
