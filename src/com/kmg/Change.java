package com.kmg;

public class Change {

	public static void main(String[] args) {
		int n[] = { 51, 23, 6, 65, 15 };
		for (int i = 0; i < n.length - 1; i++) {
			for (int j = i + 1; j < n.length; j++) {
				if (n[j] < n[i]) {
					int tmp = n[i];
					n[i] = n[j];
					n[j] = tmp;
				}
			}
		}
		for (int k : n) {
			System.out.print(k+" ");
		}
	}

}
