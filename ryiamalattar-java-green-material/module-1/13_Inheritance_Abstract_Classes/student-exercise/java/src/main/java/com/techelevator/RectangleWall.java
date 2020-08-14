package com.techelevator;

public class RectangleWall extends Wall {
	
	private int length;
	private int height;

	public RectangleWall(String name, String color, int length, int height) {
		super(name, color);
		this.height = height;
		this.length = length;
	}
	
	

	public int getLength() {
		return length;
	}



	public int getHeight() {
		return height;
	}



	@Override
	public int getArea() {
		
		return length*height;
		
	}

	public String toString() {
		String msg = getName() + " (" +length + "x" + height +") "+ "rectangle";
		return msg;
	}
	
}
