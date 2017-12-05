package com.kmg;

public class ScoreArray {

	public static void main(String[] args) {
		int scores[][] = new int[4][3];
		scores[0][0] = 11;
		scores[0][1] = 22;
		scores[0][2] = 33;
		scores[1][0] = 44;
		scores[1][1] = 55;
		scores[1][2] = 66;
		scores[2][0] = 77;
		scores[2][1] = 88;
		scores[2][2] = 99;
		scores[3][0] = 10;
		scores[3][1] = 20;
		scores[3][2] = 30;
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2]+"\t");
			int average = (scores[i][0] + scores[i][1] + scores[i][2]) / 3;
			if (average < 60) {
				System.out.println(average + "*");
			} else {
				System.out.println(average);
			}
		}
	}
}
