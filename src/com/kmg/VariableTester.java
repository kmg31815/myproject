package com.kmg;

import java.util.Random;

public class VariableTester {

	public static void main(String[] args) {
		int age = 0;
		float weight = 69.5f;
		char c = 65;
		char c2 = 'Z';
		int i = c2;
		System.out.println(i);
		
		boolean pass = false;
		System.out.println(!pass);
		System.out.println(pass);
		
		// 紙s上抄 new String 地址
		String s = new String("Hello");
		System.out.println(s);
		
		// Random 指亂數
		Random r = new Random();
		System.out.println(r.nextInt(6)+1);
		
		System.out.println(3!=2);
		System.out.println(3==2);
		System.out.println(3>2);


	}

}
