package com.java2.object.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class SimpleWriteTest {

		public static void main(String[] args) throws IOException {
			PrintStream out = new PrintStream("data.txt");
			out.println();
			out.flush();
			out.close();
		}

}
