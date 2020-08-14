package com.techelevator;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		int previousNum = 0;
		int nextNum = 1;
		int sum;
		
		
		System.out.println("Please enter the Fibonacci number:");
		 
		int theFNum = myScanner.nextInt();
		System.out.print(previousNum +" " + "," + " ");
		
		for (int i = 0 ; i <= theFNum ; i = previousNum + nextNum ) {
			
			
			sum = previousNum + nextNum;
			previousNum = nextNum;
			nextNum = sum;
			System.out.print(previousNum +" " + "," + " ");
		}
		
		System.out.print(nextNum);
	} 

}
