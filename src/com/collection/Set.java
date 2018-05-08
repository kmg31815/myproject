package com.collection;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {

		SortedSet<String> set = new TreeSet<>(Arrays.asList("Alpha", "Gamma", "Omega"));

		System.out.println(set);

	}

}
