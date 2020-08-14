package com.techelevator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class listexampels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> hobbits = new ArrayList<String>();
		
		List<Integer> Degree = new ArrayList<Integer>();
		
		hobbits.add("bill");
		hobbits.add("matty");
		hobbits.add("vin");
		
		hobbits.set(2, "Ryiam");   // this will replace th value inside index 2 with new value (Ryiam).
		
		hobbits.add(1, "David");   // this will insert this one between our list at index 1. "bill" will be index 0, "David will be index 1,
		                            // "matty" will be index 2. they will shift.
		
		hobbits.remove(0); // this will remove the value inside the index;
		
		String hobbname = hobbits.get(2); // this will get the value insed index 2 and will assign it to variabl
		
		for (String newHobbit : hobbits) {   // this for loop will go throgh all the list with no exception and it 
			                                // increament 1 each time and it's only forword 
			System.out.println(newHobbit);
		}
		
		int foundIndex = hobbits.indexOf("matty");
		System.out.println(foundIndex);
		
		System.out.println(hobbits);
		
		Queue<String> myTask = new LinkedList<String>();
		myTask.offer("task1");
		myTask.offer("task2");
		myTask.offer("task3");
		
		while (!myTask.isEmpty()) {
			System.out.println(myTask.poll());
			
		}
		
		int x=7;
		Integer xAsInteger = new Integer(x);   // boxing
		
		List<Integer> values = new ArrayList<Integer>();
		
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(5);
		values.add(new Integer(8));
		System.out.println(values);
		
		String[] array = new String[] {"Reem","Steve"}; 
		
		System.out.println(array[1].length());
		
		double w = (double) 5/2;
		System.out.println(w);
		
		
		Integer number = new Integer (4);
		
		int y = 7;
		values.add(0, 10);
		System.out.println(values);
		
		
		List<Integer> seatNumberList = new ArrayList<Integer>();
		seatNumberList.add(29);
		seatNumberList.add(19);
		seatNumberList.add(-9);
		seatNumberList.add(21);
		seatNumberList.add(11);
		seatNumberList.add(1);
		seatNumberList.add(0);
		seatNumberList.add(25);
		seatNumberList.add(15);
		seatNumberList.add(5);
		seatNumberList.add(31);
		
		List<Integer> results = new ArrayList<Integer>();
		Queue<Integer> from1To10 = new LinkedList<Integer>();
		Queue<Integer> from11To20 = new LinkedList<Integer>();
		Queue<Integer> from21To30 = new LinkedList<Integer>();
		
		for (int i = 0; i<seatNumberList.size(); i++) {
			if (seatNumberList.get(i) > 0 && seatNumberList.get(i) < 30) {
				if (seatNumberList.get(i) > 0 && seatNumberList.get(i) < 11) {
					from1To10.offer(seatNumberList.get(i));
				}
				else if (seatNumberList.get(i) > 10 && seatNumberList.get(i) < 21) {
					from11To20.offer(seatNumberList.get(i));
				}
				else if (seatNumberList.get(i) > 20 && seatNumberList.get(i) < 31) {
					from21To30.offer(seatNumberList.get(i));
				}
			}
		}
		
		for (int firstSet : from1To10) {
			results.add(firstSet);
		}
		
		for (int secondSet : from11To20) {
			results.add(secondSet);
		}
		
		for (int thirdSet : from21To30) {
			results.add(thirdSet);
		}
		
		// sort them in three different queues  then loop to check the numbers and then add them to one list of integers 
		System.out.println(results);
	
		
	}

}
