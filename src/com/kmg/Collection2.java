package com.kmg;

import java.util.ArrayList;

public class Collection2 {

	public static void main(String[] args) {

		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(94);
		list2.add(87);
		list2.add(14);
		list2.add(12);

		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		int n = list2.get(1);
		System.out.println(n);

	}

}
