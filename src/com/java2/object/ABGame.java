package com.java2.object;

import java.util.Scanner;

public class ABGame {

	public static void main(String[] args) {
		String secret = "9487";
		int a = 0;
		int b = 0;
		int k = 1;
		while (a != 4) {
			a = 0;
			b = 0;
			System.out.println("請輸入四個數字:");
			Scanner scanner = new Scanner(System.in);
			String nums = scanner.nextLine();
			int length = secret.length();
			int length2 = nums.length();
			for (int i = 0; i < length; i++) {
				char c = secret.charAt(i);
				for (int j = 0; j < length2; j++) {
					char c2 = nums.charAt(j);
					if (c2 == c) {
						if (i == j) {
							a = a + 1;
						} else {
							b = b + 1;
						}
						break;
					}
				}
			}
			System.out.println(a + "A" + b + "B");
			if (k > 5) {
				System.out.println("太多次ㄌㄅ~");
			}
			k++;
		}
	}

}
