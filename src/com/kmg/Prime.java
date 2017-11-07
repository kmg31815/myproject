package com.kmg;

public class Prime {

	public static void main(String[] args) {
		int n = 7;
		boolean prime = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				prime = false;
				// System.out.println("NOT PRIME");
				break;
			}
		}
		if (prime) {
			System.out.println(n + " IS PRIME!");
		} else {
			System.out.println(n + " IS NOT PRIME!");
		}
	}
}
