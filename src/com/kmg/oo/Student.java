package com.kmg.oo;

public class Student {
	int chinese;
	int english;
	int math;
	int science;
	String name;

	// public Student(String n, int c, int e, int m, int s) {
	//	 name = n;
	//	 chinese = c;
	//	 english = e;
	//	 math = m;
	//	 science = s;
	// }
	public Student(String name, int chinese, int english, int math, int science) {
		this.name = name;
		this.chinese = chinese;
		this.english = english;
		this.math = math;
		this.science = science;
	}

	public Student(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println(chinese + "\t" + english + "\t" + math + "\t" + science);
	}

	public int getAverage() {
		return (chinese + english + math + science) / 4;
	}
}
