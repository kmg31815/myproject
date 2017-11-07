package com.kmg;

public class Niner2 {

	public static void main(String[] args) {
		for (int n = 1; n <= 9; n++) {
			for (int i = 2; i <= 9; i++) {
				System.out.print(i + " x " + n + " = ");
				if (n * i < 10) {
					System.out.print(" ");
				}
				System.out.print(n*i+"   ");
			}
			System.out.println();
		}
	}

}
