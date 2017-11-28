package com.kmg;

import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int day = Integer.parseInt(line);
		int n[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 0; i < n.length; i++) {
			if (day <= n[i]) {
				System.out.println(i+1 + "月" + day + "日");
				break;
			} else {
				day = day - n[i];
			}
		}
	}

}