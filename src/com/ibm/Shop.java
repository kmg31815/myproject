package com.ibm;

import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
		Drink n1 = new Drink("a", 15);
		Drink n2 = new Drink("b", 20);
		Drink n3 = new Drink("c", 30);
		int n = 1;
		int money = 0;
		System.out.println("販賣機餘額:" + money);
		Scanner scanner = new Scanner(System.in);
		while (n != 0) {
			System.out.println("請投幣或選擇飲料(a或b或c),或輸入0結束:");
			String line = scanner.nextLine();
			n = Integer.parseInt(line);
			switch (n) {
			case 1:
				money = money + n;
				System.out.println("販賣機餘額:" + money);
				break;
			case 5:
				money = money + n;
				System.out.println("販賣機餘額:" + money);
				break;
			case 10:
				money = money + n;
				System.out.println("販賣機餘額:" + money);
				break;
			}
		}
		//not finish
	}

}
