package com.ibm;

public class NineLazy {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(j + " x " + i + " = " + i * j + "\t");
			}
			System.out.println();
		}
		for (int i = 4; i <= 8; i++) {
			for (int j = 1; j <= 18; j++) {
				System.out.print("..." + "\t");
			}
			System.out.println();
		}
		for (int j = 1; j <= 9; j++) {
			System.out.print(j + " x " + "9" + " = " + 9 * j + "\t");
		}
		System.out.println();
	}

}
