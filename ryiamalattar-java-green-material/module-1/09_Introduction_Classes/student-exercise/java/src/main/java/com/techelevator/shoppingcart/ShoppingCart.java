package com.techelevator.shoppingcart;

public class ShoppingCart {

	public ShoppingCart() {
		
	}
	
	private int totalNumberOfItems;
	private double totalAmountOwed;
	
	
	public int getTotalNumberOfItems() {
		return totalNumberOfItems;
	}
	public double getTotalAmountOwed() {
		return totalAmountOwed;
	}
	
	public double  getAveragePricePerItem() {
		if (totalNumberOfItems == 0) {
			return 0.00;
		}
		else  return (double)totalAmountOwed / totalNumberOfItems;
		
	}
	
	public void addItems (int numberOfItems, double pricePerItem) {
		
		totalNumberOfItems = numberOfItems;
		totalAmountOwed = (double) (totalAmountOwed + (pricePerItem * numberOfItems));
		
	}
	
	public void empty() {
		totalNumberOfItems = 0;
		totalAmountOwed  = 0;
	}
	
}
