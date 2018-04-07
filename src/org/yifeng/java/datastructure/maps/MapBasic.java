package org.yifeng.java.datastructure.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Maps: HashMap, LinkedHashMap, TreeMap
 * 
 * Features: no duplicate keys
 * 
 * Orders:
 *   - HashMap: no order
 *   - LinkedHashMap: insertion order
 *   - TreeMap: nature order by default, can be overridden by Comparable
 * 
 * Time Complexity:
 * +----------------+-----------+-----------+-----------+
 * |                |    Put    |    Get    |  Contains |
 * +----------------+-----------+-----------+-----------+
 * |  HashMap       |    O(1)   |    O(1)   |    O(1)   |
 * +----------------+-----------+-----------+-----------+
 * |  LinkedHashMap |    O(1)   |    O(1)   |    O(1)   |
 * +----------------+-----------+-----------+-----------+
 * |  TreeMap       |  O(log n) |  O(log n) |  O(log n) |
 * +----------------+-----------+-----------+-----------+
 */
public class MapBasic {
	
	public static void main(String[] args) {
		
		Map<Integer, String> hashMap = createHashMap();
		System.out.println(hashMap);

		Map<Integer, String> linkedHashMap = createLinkedHashMap();
		System.out.println(linkedHashMap);
		
		Map<Integer, String> treeMap = createTreeMap();
		System.out.println(treeMap);
	}

	private static Map<Integer, String> createHashMap() {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(4, "D");
		map.put(1, "A");
		map.put(3, "C");
		map.put(2, "B");
		return map;
	}
	
	private static Map<Integer, String> createLinkedHashMap() {
		
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(4, "D");
		map.put(1, "A");
		map.put(3, "C");
		map.put(2, "B");
		return map;
	}
	
	private static Map<Integer, String> createTreeMap() {
		
		Map<Integer, String> map = new TreeMap<>();
		map.put(4, "D");
		map.put(1, "A");
		map.put(3, "C");
		map.put(2, "B");
		return map;
	}
}
