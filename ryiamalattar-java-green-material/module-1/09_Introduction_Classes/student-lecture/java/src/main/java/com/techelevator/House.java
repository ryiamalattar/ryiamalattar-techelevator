package com.techelevator;

public class House {
	
	private int numberOfBedRooms;
	private double squareFootage;
	private double numOfBathrooms;
	private boolean hasBasement;
	private  int garageSize;
	private boolean Termies;
	private boolean solid = false;
	private double price;
	
	public void termiesChange() {
		this.Termies = true;
	}
	
	
	public int getNumOfBedRooms() {
		return numberOfBedRooms;
	}
	
	public void setNumOfBedRooms(int number) {
		numberOfBedRooms= number;
	}

	public int getNumberOfBedRooms() {
		return numberOfBedRooms;
	}

	public void setNumberOfBedRooms(int numberOfBedRooms) {
		this.numberOfBedRooms = numberOfBedRooms;
	}

	public double getSquareFootage() {
		return squareFootage;
	}

	public void setSquareFootage(double squareFootage) {
		this.squareFootage = squareFootage;
	}

	public double getNumOfBathrooms() {
		return numOfBathrooms;
	}

	public void setNumOfBathrooms(double numOfBathrooms) {
		this.numOfBathrooms = numOfBathrooms;
	}

	public boolean isHasBasement() {
		return hasBasement;
	}

	public void setHasBasement(boolean hasBasement) {
		this.hasBasement = hasBasement;
	}

	public int getGarageSize() {
		return garageSize;
	}

	public void setGarageSize(int garageSize) {
		this.garageSize = garageSize;
	}

	public boolean isTermies() {
		return Termies;
	}
	
	

	public void setTermies(boolean termies) {
		Termies = termies;
	}


	public boolean isSolid() {
		return solid;
	}

	
	
	
	
}
