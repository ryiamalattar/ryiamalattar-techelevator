package com.techelevator;

public class KataFizzBuzz {

	public String fizzBuzzMethod(int number) {
		
		String str = "";
		String  intToStr = Integer.toString(number);
		
		
		if (number >= 1 && number <=100) {
		
		   if ((number % 5 == 0  && number % 3 == 0) || (intToStr.contains("3") && intToStr.contains("5")) ) {
			return str = "FizzBuzz";
		}
		
		   else if (number % 3 == 0 || intToStr.contains("3")) {
			return str = "Fizz";
		}
		   else if (number % 5 == 0|| intToStr.contains("5")) {
			return str = "Buzz";
		}
		   else {
			   return Integer.toString(number);
		}
		}

		return str;
	
		
	}
	
}
