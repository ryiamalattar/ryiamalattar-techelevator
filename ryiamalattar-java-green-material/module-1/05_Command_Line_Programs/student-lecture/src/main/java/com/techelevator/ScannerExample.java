package com.techelevator;
import java.util.Scanner; // this is to call the scanner library 



public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner (System.in); // this is to creat a new scanner called myScanner
		
		
		System.out.println("Are we there yet? enter Y for yes , N for No");
		
		String answer = myScanner.nextLine();
		
		System.out.println("you typed in " + answer);
		
		if ( answer.equals("Y")) {
			System.out.println("sweet");
			
		}
		else System.out.println("continue driving");
		
	}

}
