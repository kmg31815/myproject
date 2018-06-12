package com.java2.oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {

	int total = 0;
	List<Drink> drinks = new ArrayList<>();

	public void on() {
		System.out.println("Please insert coins...");
		for (int i = 0; i < drinks.size(); i++) {
			Drink drink = drinks.get(i);
			System.out.println(drink.getid() + "\t" + drink.getName() + "\t" + drink.getprice());
		}
		Scanner scanner = new Scanner(System.in);
		int data = -1;
		int money = 0;
		while (data != 0) {
			data = scanner.nextInt();
			switch (data) {
			case 0:
				break;
			case 5:
				money = money + 5;
				System.out.println("現在金額:" + money);
				break;
			case 10:
				money = money + 10;
				System.out.println("現在金額:" + money);
				break;
			case 50:
				money = money + 50;
				System.out.println("現在金額:" + money);
				break;
			case 1:
				money = money - 25;
				if (money >= 0) {
					System.out.println("現在金額:" + money);
					System.out.println("this is your Coke~");
				} else {
					money = money + 25;
					System.out.println("餘額不足,請再投錢");
				}
				break;
			case 2:
				money = money - 30;
				if (money >= 0) {
					System.out.println("現在金額:" + money);
					System.out.println("this is your Juice~");
				} else {
					money = money + 30;
					System.out.println("餘額不足,請再投錢");
				}
				break;
			case 3:
				money = money - 20;
				if (money >= 0) {
					System.out.println("現在金額:" + money);
					System.out.println("this is your Sprite~");
				} else {
					money = money + 20;
					System.out.println("餘額不足,請再投錢");
				}
				break;

			}
		}
	}

}
