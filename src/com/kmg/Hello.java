package com.kmg;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Hello World!");
       
       Person p = new Person();
       p.sayhello();
       
       
		int x = 9;
		int y = 5;
		int z = x/y;
		System.out.println(z);
		System.out.println(x==y);
		System.out.println(x>y);
		System.out.println(x<y);
		System.out.println(x!=y);
		System.out.println(x>=y);
		System.out.println(x<=y);
		System.out.println(x+1);
		x++;
		//x = x + 1
		x+=2;
		//x = x + 2
		System.out.println(x);
		
		
		System.out.println("請輸入您的名字:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		System.out.println("Hello, "+line);
		
		System.out.println("你幾歲?");
		line = scanner.nextLine();
		int age = Integer.parseInt(line);
		System.out.println(age>25);
		
		String data = "123";
		int n = Integer.parseInt(data);
		
		String mydata = String.valueOf(n);
		
		
	}

}
