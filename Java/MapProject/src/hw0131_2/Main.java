package hw0131_2;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		HashMap<String, String> carModel = new HashMap<String, String>();
			
		
		carModel.put("Tacoma" , "Toyota");
	    carModel.put("Prius", "Toyota");
	    carModel.put("Challenger", "Dodge");
	    carModel.put("Ram", "Dodge");
	    carModel.put("F150" , "Ford");
	    carModel.put("Mustang", "Ford");
	    carModel.put("Vanagon", "Volkswagen");
	    carModel.put("Trax", "Chevy");
	    carModel.put("Civic" , "Honda");
	    carModel.put("Accord", "Honda");
	    
	    Scanner userInput = new Scanner(System.in);
	    
	    System.out.println("What model vehicle are you looking for?");
	    String customerCar = userInput.nextLine();
	    
	    for (String i : carModel.keySet()) {
	    	
	    	if(customerCar.equals(i)) {
	    		System.out.println("Oh, you're looking for a " + i + "?" +
	    							" Our " + carModel.get(i) + " selection is right over here.");
	    	}
	    	
	    }
	    
	    userInput.close();
	    
	    
	}

}
