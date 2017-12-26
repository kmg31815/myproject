package com.kmg.oo;

public class Tester {

	public static void main(String[] args) {
		Student stu1 = new Student("野比大雄:", 55, 66, 77, 88);
		Student stu2 = new Student("出木杉:", 66, 77, 88, 99);

		// stu.chinese = 55;
		// stu.english = 66;
		// stu.math = 77;
		// stu.science = 88;
		stu1.pass = 50;
		stu1.print();
		stu2.print();
		int avg = stu1.getAverage();
		System.out.println("野比大雄:" + avg);

		GraduateStudent gstu = new GraduateStudent();
		gstu.chinese = 100;
	}

}