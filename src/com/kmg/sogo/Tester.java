package com.kmg.sogo;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		/*
		Customer c1 = new Customer(1000);
		c1.print();
		SilverCustomer c2 = new SilverCustomer(1000);
		c2.print();
		GoldenCustomer c3 = new GoldenCustomer(1000);
		c3.print();
		*/

		/*
		ArrayList<Customer> customers = new ArrayList<>();
		Customer c1 = new Customer(10000);
		SilverCustomer c2 = new SilverCustomer(10000);
		GoldenCustomer c3 = new GoldenCustomer(10000);
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		for (int i = 0; i < customers.size(); i++) {
			Customer c = customers.get(i);
			c.print();
		}
		*/
		ArrayList<Customer> customers = new ArrayList<>();
		customers.add(new Customer(10000));
		customers.add(new SilverCustomer(10000));
		customers.add(new GoldenCustomer(10000));
		for (int i = 0; i < customers.size(); i++) {
			Customer c = customers.get(i);
			c.print();
		}
	}

}
