package com.mfino.javabasics;

public class TwodimentionalArray {

	public static void main(String[] args ){
	
		String s[][]=new String[3][5];
		s[0][1]="narayana";
		s[0][2]="narayana";
		s[0][3]="narayana";
		s[0][4]="narayana";
		
		System.out.println(s.length);// -- total no of rows 
		System.out.println(s[1].length);  // total no of columns
		System.out.println(s[0][3]);
	 for(int row=0;row<s.length;row++){
		 for(int col=0;col<s.length;col++){
			 System.out.println(s[row][col]);
		 }
	 }
	}
	
}
