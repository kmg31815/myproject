package com.java2.object;

import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		System.out.println("請輸入天數:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int day = Integer.parseInt(line);
		int n[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 0; i < n.length; i++) {
			if (day > n[i]) {
				day = day - n[i];
			} else {
				System.out.println(i + 1 + "月" + day + "日");
				break;
			}
		}

	}

}
