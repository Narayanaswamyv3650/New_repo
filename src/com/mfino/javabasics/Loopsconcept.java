package com.mfino.javabasics;

public class Loopsconcept {
public static void main(String[] args){
	
	//while loop -- dis it generates the infinite loops untill we give incremential or decremental 
	int i=0;
	while(i<=10){
		System.out.println(i);
		i=i+1;
	}
	
	//for loop 
	for(int j=1;j<10;j++){
		System.out.println(j);
	}
	
	// print 10 to 0 
	for(int k=10;k>=-10;k--){
		System.out.println(k);
	}
}
}
