package com.java2.oo;

import java.util.Random;

public class Bingo {

	public static void main(String[] args) {
		int n[][] = new int[5][5];
		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				n[i][j] = (r.nextInt(25) + 1);
				System.out.print(n[i][j] + "\t");
			}
			System.out.println("");
		}
	}

}
