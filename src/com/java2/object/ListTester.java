package com.java2.object;

import java.util.List;
import java.util.ArrayList;

public class ListTester {

	public static void main(String[] args) {
		List<Integer> cards = new ArrayList<>();
		cards.add(9);
		cards.add(4);
		cards.add(8);
		cards.add(7);
		System.out.println(cards.size());
		System.out.println(cards.get(2));
		System.out.println(cards.remove(0));
		System.out.println(cards.size());
		System.out.println(cards.get(2));
	}

}
