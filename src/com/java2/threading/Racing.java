package com.java2.threading;

public class Racing {

	public static void main(String[] args) {
		Horse h1 = new Horse();
		Horse h2 = new Horse();
		h1.start();
		h2.start();
	}

}
