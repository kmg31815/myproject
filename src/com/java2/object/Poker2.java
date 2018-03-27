package com.java2.object;

import java.util.List;
import java.util.ArrayList;

public class Poker2 {

	public static void main(String[] args) {
		List<Integer> cards = new ArrayList<>();
		String s = "SHDC";
		for (int i = 0; i < cards.size(); i++) {
			cards.add(i);
			System.out.println(i % 13 + 1 + "" + s.charAt(i / 13));
		}
	}

}
