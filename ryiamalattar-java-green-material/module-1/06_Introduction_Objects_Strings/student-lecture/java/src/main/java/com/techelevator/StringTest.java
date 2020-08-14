package com.techelevator;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int index = -1;
		String myStr = "Java";
		
		if (index == myStr.length()-1 || index > myStr.length() || index < 0) { 
				String strTwo = myStr.substring(0,2); 
				System.out.println(strTwo);
			}
			
		else {
			char[] charArray = myStr.toCharArray();
			char[] twoCharArr = new char[2];
			
		int j = index;
			for (int i = 0; i<2; i++) {
				twoCharArr[i] = charArray[j];
				j++;
			}
			String theIndexString = new String(twoCharArr);
			
			System.out.println(theIndexString);
		}
		
		String str = new String("xx");

		if (str.length() < 3) {
			System.out.println("false");
		}
		else if (str.length() >= 3) {
			
			char[] charArray = str.toCharArray();
			char[] badBeginArr = new char[3];
			char[] badMidArr = new char[3];
			
			for (int i =0; i< 3; i ++) {
				badBeginArr[i] = charArray[i];
			}
			int x=0;
			for (int j =1; j <=3; j++) {
				badMidArr[0] = charArray[j];
				x++;
			}
			
			String badBegin = new String(badBeginArr);
			String badMid = new String(badMidArr);
			
			if (badBegin.equals("bad") || badMid.equals("bad")) {
				System.out.println("true");
			}
			else System.out.println("false");
		} 

		String str2 = "solvingmath";
		
		String firsthalf = str2.substring((str2.length()/2)-1);
		
		System.out.println(firsthalf);
	}

}
