package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		/*
		 * List<Integer> list = new ArrayList<>(); list.add(2); list.add(0);
		 * list.add(1); list.add(7);
		 */
		List<Integer> list = new ArrayList<>(Arrays.asList(2, 0, 1, 7));
		System.out.println(list);

		List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));

		String[] strArray = nameList.toArray(new String[0]);
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
	}
}