package com.java2.object;

public class SpecialCustomer extends Customer {
	public SpecialCustomer(int amount) {
		super(amount);
		super.discount = 0.9f;
		super.points = 2;
	}

	public SpecialCustomer() {

	}
}
