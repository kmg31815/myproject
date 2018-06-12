package com.java2.oo;

import java.util.Random;
import java.util.Scanner;

public class MazeMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 1;
		int hp = 100;
		Random r = new Random();
		int k[][] = new int[r.nextInt(5)][r.nextInt(5)];

		while (hp != 0) {
			System.out.print("請輸入指令:");
			String line = scanner.nextLine();
			n = Integer.parseInt(line);
			switch (n) {
			case 2:

				hp = hp - 1;
				break;
			case 4:

				hp = hp - 1;
				break;
			case 6:

				hp = hp - 1;
				break;
			case 8:

				hp = hp - 1;
				break;

			default:
				break;
			}
		}
	}

}
