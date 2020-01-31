package com.mfino.collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
	public static void main(String[] args) throws IOException {

		FileReader read = new FileReader("C:\\Users\\Narayan\\Desktop\\QA -Aws details.txt");
		BufferedReader budfreader = new BufferedReader(read);
		System.out.println("Start");
		String textfromfile = null;
		while ((textfromfile = budfreader.readLine()) != null) {
			System.out.println(textfromfile);

		}
		read.close();
		budfreader.close();
	}
}