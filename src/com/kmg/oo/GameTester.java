package com.kmg.oo;

import java.util.Scanner;

public class GameTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 1;
		int pos = 0;
		int row = 3;
		int col = 5;
		int hp = 100;
		System.out.println(hp);
		while (hp != 0) {
			System.out.print("請輸入指令:");
			String line = scanner.nextLine();
			n = Integer.parseInt(line);
			switch (n) {
			case 2:
				if (pos / col < row - 1) {
					System.out.println("向下");
					pos = pos + col;
					hp = hp - 5;
				} else {
					hp = hp - 30;
				}
				System.out.println("目前位置:"+pos);
				System.out.println("目前HP:" + hp);
				break;
			case 4:
				if (pos % col > 0) {
					System.out.println("向左");
					pos = pos - 1;
					hp = hp - 5;
				} else {
					hp = hp - 30;
				}
				System.out.println("目前位置:"+pos);
				System.out.println("目前HP:" +hp);
				break;
			case 6:
				if (pos % col < col - 1) {
					System.out.println("向右");
					pos = pos + 1;
					hp = hp - 5;
				} else {
					hp = hp - 30;
				}
				System.out.println("目前位置:"+pos);
				System.out.println("目前HP:" +hp);
				break;
			case 8:
				if (pos / col > 0) {
					System.out.println("向上");
					pos = pos - col;
					hp = hp - 5;
				} else {
					hp = hp - 30;
				}
				System.out.println("目前位置:"+pos);
				System.out.println("目前HP:" +hp);
				break;
			}
			
		}
	}
}
