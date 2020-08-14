package com.techelevator;
import java.util.Scanner;  // calling the Scanner library 

public class HumanDogYearsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myScanner = new Scanner(System.in); // to connect to the user input (keyboard)
		
		System.out.println("How old are you human"); // this is to display the question to user
		
		int humanAge = myScanner.nextInt(); // humanAge will carry the input answer of user & myScanner.nextInt() is to grab the int entry from the user 
		myScanner.nextLine();  // this will handle the /n
		
		System.out.println("age of human:" + humanAge * 7);
		
	
	}

}
