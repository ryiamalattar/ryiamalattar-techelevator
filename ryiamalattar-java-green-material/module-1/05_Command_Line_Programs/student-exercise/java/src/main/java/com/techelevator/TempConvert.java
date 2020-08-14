package com.techelevator;
import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		float tC;
		int tempCe;
		float tF;
		int tempFa;
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Please enter the temperature:") ;
		
		int theTemp = myScanner.nextInt();
		myScanner.nextLine();
		
		System.out.println("Is the temperature in (C)elsius, or (F)ahrenheit?") ; 
		
		String answer = myScanner.nextLine();
		
		if (answer.equals("F")) {
			
			tC = (theTemp - 32) / 1.8F; 
			tempCe = (int) tC;
			System.out.println(theTemp + "F" + "is" + tempCe + "C") ; 
		}
		else if (answer.equals("C")) {
			
			tF = (theTemp * 1.8F) + (int)32;
			tempFa = (int)tF;
			System.out.println(theTemp + "C\t" + "is\t" + tempFa + "F") ; 
		}
		
	}

}
