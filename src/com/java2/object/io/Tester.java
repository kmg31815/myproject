package com.java2.object.io;

public class Tester {

	class Animal {

		public void say() {
			System.out.println();
		}
	}

	class Cat extends Animal {
		public void say() {
			System.out.println("meow-meow");
		}
	}

	class Dog extends Animal {
		public void say() {
			System.out.println("arf-arf");
		}

	}

	class Duck extends Animal {
		public void say() {
			System.out.println("quack-quack");
		}

	}
}
