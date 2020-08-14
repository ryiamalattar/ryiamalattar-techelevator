package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapsexampels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> stateCodes =new HashMap<String,String>();
		
		stateCodes.put("OH", "Ohio");
		stateCodes.put("TX", "Texas");
		stateCodes.put("UT", "Utah");
		stateCodes.put("NY", "New York");
		
		String myState = stateCodes.get("OH");
		
		
		String myState2 = stateCodes.get("AK");
		if(myState2 ==null) {
			System.out.println("notFound");
			
		}
		
		if (stateCodes.containsKey("TX")) {
			System.out.println("True");
		}
		
		// loop through maps using the Keys
		
		Set<String> keys = stateCodes.keySet();
		for (String key : keys) {
			System.out.println(stateCodes.get(key));
			
			if (stateCodes.get(key).equals("New York")) {
				System.out.println("foud ny");
				
			}
			
			Map<String, Integer> filingStatus = new HashMap<String, Integer>();
			
			filingStatus.put("OH", new Integer(1000)); // this is boxing as Maps accepts only objects 
			filingStatus.put("TX", 5000);   // this is auto boxing , the complier auto boxed  the int value;
			
			Map<String, int[]> scores = new HashMap<String, int[]>();
			
			int [] student1 = new int [] {1,2,3,4,5};
			int [] student2 = new int [] {3,6,2,6,7};
			
			scores.put("123", student1);  
			scores.put("222", student2);
			
			int[] tempArray = scores.get("123");  // we pulled the value of key 123 which is student1 then assign it to new array
			int x = tempArray[0];  // then we grabbed the first value of student1 then assign it to int x;
			
			     
		}
	}

}
