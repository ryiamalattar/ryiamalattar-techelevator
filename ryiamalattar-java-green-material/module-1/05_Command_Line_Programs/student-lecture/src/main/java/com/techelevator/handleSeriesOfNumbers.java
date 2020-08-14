package com.techelevator;
import java.util.Scanner;
public class handleSeriesOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in); // (system.in) is to read from user input
		
		System.out.println("enter a series of num split by comma"); // the question for the user
		
		String ageInput = myScanner.nextLine(); // we create a variable type String to hold the series, as we can't hold a series in Int variable 
		
		String[] ages = ageInput.split(","); // .split(",") is to spilt each input (that is already splitd by comma) and assign it to index of an array. 
		 // each value of the array will be string type
		
		for ( int i=0; i< ages.length; i++) {  // 
			
			String tempAge = ages[i]; 
			int ageAsInt = Integer.parseInt(tempAge); //  to convert from String to Int
			
			System.out.println("your age in do years" + ageAsInt);
			
		}
	}

}
