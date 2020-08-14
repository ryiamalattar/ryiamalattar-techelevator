package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {

	private String name;
	private String address;
	private String phoneNumber;
	private List<Accountable> accounts = new ArrayList<Accountable>();

	// bellow are getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Accountable[] getAccounts() {
		Accountable[] array = new Accountable[accounts.size()];
		int i = 0;
		for (Accountable b : accounts) {
			array[i] = b;
			i++;
		}
		return array;
	}

	// below different methods

	public void addAccount(Accountable newAccount) {
		accounts.add(newAccount);
	}

	public boolean isVip() {
		int sum = 0;
		for (Accountable account : accounts) {
			sum = sum + account.getBalance();
		}
		if (sum >= 25000) {
			return true;
		} else {
			return false;
		}
	}

}
