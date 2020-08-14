package com.techelevator.dog;

public class Dog {

	private boolean isSleeping;
	
	public Dog() {  
		isSleeping = false; 
	}
	
	public boolean isSleeping() {
		return this.isSleeping;
	}
	
	
	public String makeSound() {
		if (isSleeping == true) {
			return "Zzzzz...";
		}
		else return "Woof!";
	}
	
	public void sleep() {
		isSleeping = true;
	}
	
	public void wakeUp() {
		isSleeping= false;
	}
	
	
}
