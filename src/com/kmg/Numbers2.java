package com.kmg;

public class Numbers2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 15; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}
}
