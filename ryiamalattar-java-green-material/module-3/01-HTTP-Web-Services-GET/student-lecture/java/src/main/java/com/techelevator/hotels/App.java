package com.techelevator.hotels;

import java.util.Scanner;


import org.springframework.web.client.RestTemplate;

public class App {
	
	private UserInterface ui;
	private static final String API_BASE_URL = "http://localhost:3000/";
	private RestTemplate restTemplate = new RestTemplate();

    public static void main(String[] args) {
    	App app = new App();
        app.run();
    }

    private void run() {
    	
    	ui = new UserInterface();
        Hotel[] hotels = null;
        boolean isFinished = false;
        String menuSelection;
        

        while(!isFinished) {
  
            menuSelection = ui.printGreeting();
 
            if (menuSelection.equals("1")) {
                System.out.println("Not implemented");
            } 
            else if (menuSelection.equals("2")) {
                System.out.println("Not implemented");
            } 
            else if (menuSelection.equals("3")) {
                System.out.println("Not implemented");
            } 
            else if (menuSelection.equals("4")) {
                System.out.println("Not implemented");
            } 
            else if (menuSelection.equals("5")) {
                System.out.println("Not implemented");
            } 
            else if (menuSelection.equals("6")) {
                System.out.println("Not implemented - Create a custom Web API query here");
            } 
            else if (menuSelection.equals("0")) {
            	isFinished = true;
            } 
            else {
                System.out.println("Invalid Selection");
            }
 
        }
        
        System.out.println("Goodbye!");

    }

	    private Hotel[] requestHotels() {
	    	return restTemplate.getForObject(API_BASE_URL + "hotels", Hotel[].class);
	    }
	
	    private Review[] requestReview() {
	    	return restTemplate.getForObject(API_BASE_URL + "reviews", Review[].class);
	    }
	    
	    private Hotel requestHotelByID(int id) {
	    	return restTemplate.getForObject(API_BASE_URL + "hotels/" + id, Hotel.class);
	    }
}
