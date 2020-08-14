package com.techelevator;
import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		
		float meterInFloat;
		int meterInInt;
		float footInFloat;
		int footInInt;
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Please enter the length:") ;
		
		int theLength = myScanner.nextInt();
		myScanner.nextLine();
		
		System.out.println("Is the measurement in (m)eter, or (f)eet?") ; 
		
		String answer = myScanner.nextLine();

		if (answer.equals("f")) {
			
			meterInFloat = theLength * 0.3048F;
			meterInInt = (int) meterInFloat;
			System.out.println(theLength + "f\t" + "is\t" + meterInInt + "m" );
			
		}
		else if(answer.equals("m")) {
			
			footInFloat = theLength * 3.2808399F;
			footInInt = (int)footInFloat;
			System.out.println(theLength + "m\t" + "is\t" + footInInt + "f" );
		}
	}

}
