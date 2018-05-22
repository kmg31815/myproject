package com.java2.snowing;

import java.util.Random;

public class Snow extends Thread {
	Random r = new Random();
	int x;
	int y = 800;

	public Snow() {
		x = r.nextInt(600);
	}

	@Override
	public void run() {
		for (int i = 800; i > 0; i--) {
			System.out.println(getName() + ":(" + x + "," + y + ")");
			y = y - 1;
			int movement = r.nextInt(3) - 1;
			x = x + movement;

		}
	}
}
