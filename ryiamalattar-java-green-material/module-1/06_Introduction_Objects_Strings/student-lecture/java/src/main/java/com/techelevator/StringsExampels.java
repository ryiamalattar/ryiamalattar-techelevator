package com.techelevator;

public class StringsExampels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String myString = "The big bad wolf";
		
		boolean isFound = myString.contains("big");
		
		System.out.println(isFound);
		
		if (myString.startsWith("Bob")) {
			System.out.println("word is found");
		}
		else System.out.println("word not found");
		
		myString = myString.replace("bad", "good");
		System.out.println(myString);
		
		myString.substring(4);  // this will return the original string because we did not assign to a variable
		System.out.println(myString);
		
		String trimExample = "steve T";
		String afterTrim = trimExample.trim();
		
		char [] myArray = new char[] {'s', 't', 'v', 'e'};
		
		String nameUsingChar = new String(myArray);
		
		String myName = "Ryiam";
		
		char[] myNameArray = myName.toCharArray();
		
		String last2 = myName.substring(myName.length() - 2);  // this is a solution for String extrEnd problem
		
		System.out.println(last2+last2+last2); // this is a solution for String extrEnd problem
		
		
	//	if (a.length()> b.length()) {      // thi
	//		return a + b + a;
	//	}
	//	else if  (b.lenght() > a.length) {
	//		return b +a+b;
	//	}
		
	//	if (a == null || b == null) {    // this is an example to check a null value
	//		return "";
	//	}
	
		
	// this is the Times	
	//	check length
	//	if length less than 3   retunr whateer is there by concatnating n time 
		
	//	grab whatever is there
	//	loop n times
	//	indside my loop do the concat
	//	exit loop
	//	retun new string
		//
	//	else grab first three charecters and concat that n times
		// use substring to grab first 3
		// loop
		
		String str = "Hello";
		
		char lastSecondChar = str.charAt(str.length()-2);
		System.out.println(lastSecondChar);
		char lastChar = str.charAt(str.length()-1);
		String remainStr = str.substring(0, str.length()-2);
		
	System.out.println(lastChar);
	System.out.println(lastSecondChar + lastChar + remainStr);
	
	
	String str2 = "oddlyby";
	
	String lastTwo = str2.substring(str2.length()-2);
	if (lastTwo.equals("ly")) {
		System.out.println("true");
	}
	else System.out.println("false");
	
	
//	String example;
//	char c = example.charAt(0);
	
//	Character char1 = new Character(c);
//	char1.toString(c);
	
	String aa = "Ryiam";
	System.out.println(aa.charAt(1));
	
	
	
	
	}
}


