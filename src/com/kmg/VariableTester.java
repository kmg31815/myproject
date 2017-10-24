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
		
		
		String s = new String("Hello");
		System.out.println(s);
		
		Random r = new Random();
		System.out.println(r.nextInt(6)+1);
		
		System.out.println(3!=2);
		System.out.println(3==2);
		System.out.println(3>=2);
		
		String k = new String("hello");
		int len = k.length();
		System.out.println("len:" + len);
		System.out.println(k.charAt(0));
		System.out.println(k.charAt(1));


	}

}
