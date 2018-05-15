package com.java2.threading;

public class RacingNG {
	public static void main(String[] args) {
		Horse h1 = new Horse();
		h1.start();
		// Horse h2 = new Horse();
		// h2.start();
		HorseRunable h2 = new HorseRunable();
		Thread thr = new Thread(h2);
		thr.start();

		try {
			h1.join();
			thr.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
