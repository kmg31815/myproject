package com.kmg;

import java.util.ArrayList;

public class Collection {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(94);
		list.add(87);
		list.add("gg");
		list.add(1.5);

		int n = (int) list.get(1);
		String a = (String) list.get(2);

		System.out.println(list.get(1));
		System.out.println(list.size());
		list.remove(2);
		System.out.println(list.get(2));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
