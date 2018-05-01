package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Collection {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(9);
		list.add(4);
		list.add(8);
		list.add(7);
		list.add(9);
		list.add(4);
		System.out.println(list);

		Set<Integer> set = new HashSet<>();
		set.add(9);
		set.add(4);
		set.add(8);
		set.add(7);
		set.add(9);
		set.add(4);
		System.out.println(set);

		Set<String> set2 = new HashSet<>();
		set2.add("k");
		set2.add("m");
		set2.add("g");
		set2.add("g");
		set2.add("j");
		set2.add("k");
		System.out.println(set2);

		Map<String, String> stocks = new TreeMap<>();
		stocks.put("118", "KMG");
		stocks.put("235", "Tina");
		stocks.put("170", "fish");
		stocks.put("782", "sdfjkl");
		System.out.println(stocks);
	}

}
