package com.kmg.oo;

public class Tickets {
	String date;
	String time;
	String start;
	String arrive;
	int price;

	public Tickets(String date, String time, String start, String arrive, int price) {
		this.date = date;
		this.time = time;
		this.start = start;
		this.arrive = arrive;
		this.price = price;
	}

	public void print() {
		System.out.println(date + "\t" + time + "\t" + start + "\t" + arrive + "\t" + price);
	}
}
