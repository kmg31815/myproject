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
		int k = -1;
		int money = 0;
		while (k != 0) {
			k = scanner.nextInt();
			switch (k) {
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
				Drink drink = drinks.get(k-1);
				money = money - drink.getprice();
				if (money >= 0) {
					System.out.println("現在金額:" + money);
					System.out.println("this is your Coke~");
				} else {
					money = money + drink.getprice();
					System.out.println("餘額不足,請再投錢");
				}
				break;
			case 2:
				Drink drink1 = drinks.get(k-1);
				money = money - drink1.getprice();
				if (money >= 0) {
					System.out.println("現在金額:" + money);
					System.out.println("this is your Juice~");
				} else {
					money = money + drink1.getprice();
					System.out.println("餘額不足,請再投錢");
				}
				break;
			case 3:
				Drink drink2 = drinks.get(k-1);
				money = money - drink2.getprice();
				if (money >= 0) {
					System.out.println("現在金額:" + money);
					System.out.println("this is your Sprite~");
				} else {
					money = money + drink2.getprice();
					System.out.println("餘額不足,請再投錢");
				}
				break;

			}
		}
	}

}
