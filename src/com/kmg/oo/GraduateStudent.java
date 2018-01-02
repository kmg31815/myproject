package com.kmg.oo;

public class GraduateStudent extends Student {
	int thesis;
	public GraduateStudent() {
		super();
		
	}

	@Override
	public void print() {
		System.out.println(chinese + "\t" + english + "\t" + math + "\t" + thesis);
	}

	@Override
	public int getAverage() {
		return (chinese + english + math + thesis) / 4;
	}
}
