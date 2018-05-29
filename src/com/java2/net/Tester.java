package com.java2.net;

import java.io.InputStream;
import java.net.Socket;

import javax.swing.JFrame;

public class Tester extends JFrame {
	public Tester() {
		setSize(200, 300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		System.out.println();
		try {
			Socket socket = new Socket("ptt.cc", 23);
			InputStream is = socket.getInputStream();
			for (int i = 0; i < 5000; i++) {
				int data = is.read();
				System.out.println(data);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
