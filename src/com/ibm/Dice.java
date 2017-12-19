package com.ibm;

import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		for (int j = 1; j <= 10; j++) {
			Random r1 = new Random();
			Random r2 = new Random();
			Random r3 = new Random();
			Random r4 = new Random();
			int a = r1.nextInt(6) + 1;
			int b = r2.nextInt(6) + 1;
			int c = r3.nextInt(6) + 1;
			int d = r4.nextInt(6) + 1;
			System.out.print(a + " ");
			System.out.print(b + " ");
			System.out.print(c + " ");
			System.out.print(d + " ");
			
			if (a == b || a == c || a == d || b == c || b == d || c == d) {
				System.out.println();
			} else {
				System.out.println("*");
			}
		}
	}
//error
}
