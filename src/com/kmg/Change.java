package com.kmg;

public class Change {

	public static void main(String[] args) {
		int n[] = { 51, 23, 6, 65, 15 };
		for (int i = 0; i < n.length; i++) {
			for (int j = i + 1; j < (n.length)-1 ; j++) {
				int a = n[i];
				int b = n[j];
				if(b<a){
					int tmp = a;
					a = b;
					b = tmp;
				}
				System.out.print(n[i]+" ");
			}
		}
	}

}
