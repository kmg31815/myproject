package com.kmg;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		System.out.println("請輸入您的年齡:");
		Scanner scanner = new Scanner(System.in); 
		String line = scanner.nextLine();
		int age = Integer.parseInt(line);
		if (age<12){
			System.out.println("國小?");
		}else{
			if (age<15){
				System.out.println("國中?");
			}else{
				if (age<18){
					System.out.println("高中?");
				}else{
					System.out.println("要不要喝酒?");
				}
			}
		}
	}

}
