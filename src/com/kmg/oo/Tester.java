package com.kmg.oo;

public class Tester {

	public static void main(String[] args) {
		Student stu = new Student("野比大雄:", 55, 66, 77, 88);
		// stu.chinese = 55;
		// stu.english = 66;
		// stu.math = 77;
		// stu.science = 88;
		stu.print();
		int avg = stu.getAverage();
		System.out.println("野比大雄:" + avg);
	}

}