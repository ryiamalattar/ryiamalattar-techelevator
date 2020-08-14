package com.techelevator;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Please enter in a series of decimal values (separated by spaces):");
		
		String decimalEntry = myScanner.nextLine();
		
		String[] dNumbers = decimalEntry.split(" ");
		
		for (int i = 0 ; i <dNumbers.length; i++) {
			
			String myNum = dNumbers[i];
			int entryNum = Integer.parseInt(myNum);
			int numInDeci = entryNum;
			
			int remainder;
			String binaryNumbers = "";
			
			while (numInDeci > 0) {
				remainder = numInDeci % 2;
				binaryNumbers = remainder +"" + binaryNumbers;
				
				numInDeci = numInDeci / 2;
				
			}
			System.out.println(entryNum + " " +"in binary is" + " " + binaryNumbers);
			
		}
	}

}
