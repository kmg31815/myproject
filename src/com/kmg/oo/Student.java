package com.kmg.oo;

public class Student {
	int chinese;
	int english;
	int math;
	int science;
	String name;

	public Student(String name, int c, int e, int m, int s) {
		chinese = c;
		english = e;
		math = m;
		science = s;
	}

	public void print() {
		System.out.println(chinese + "\t" + english + "\t" + math + "\t" + science);
	}

	public int getAverage() {
		return (chinese + english + math + science) / 4;
	}
}
