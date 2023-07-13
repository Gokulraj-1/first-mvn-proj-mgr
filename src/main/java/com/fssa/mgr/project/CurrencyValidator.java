package com.fssa.mgr.project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyValidator { // create a public class

	public static void main(String[] args) { // main method starts

		Currency detail = new Currency(); // create a new object

		if (detail.equals(null)) { // check if the object is null or not
			throw new IllegalArgumentException("The Object Cannot be Null");
		}

		nameValidate(detail.getName());
		symbolValidate(detail.getSymbol());
		idValidate(detail.getId());
		rankValidate(detail.getRank());
		priceValidate(detail.getPrice());
		
		
		
		
	}

	// Create a method to validate a name and store

	public static boolean nameValidate(String name) throws IllegalArgumentException {

		if (name == null || "".equals(name.trim())) {

			throw new IllegalArgumentException("Invalid name. Name cannot be null or Empyty.");
		}

		String userName = name.trim();

		String regex = "^[A-Za-z]{2,50}";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(userName);
		boolean isMatch = matcher.matches();

		if (!isMatch) {
			throw new IllegalArgumentException ("Invalid name");
		}
		
		return true;

	}

//  Create a method to validate a name and store

	public static boolean symbolValidate(String symbol) throws IllegalArgumentException {

		if (symbol == null || "".equals(symbol.trim())) {

			throw new IllegalArgumentException("Invalid Symbol. Symbol cannot be null or Empty.");
		}

		String symbol1 = symbol.trim();

		String regex = "^[A-Z]{1,5}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(symbol1);
		boolean isMatch = matcher.matches();

		if (!isMatch) {
			throw new IllegalArgumentException("Invalid Symbol");
		}

		return true;

	}

	
//  Create a method to validate a Id and store
	public static boolean idValidate(int id) throws IllegalArgumentException {

		if (id < 0) {

			throw new IllegalArgumentException("Id cannot be less than zero");
		}

		return true;
	}
	
	
//  Create a method to validate a Rank and store

	public static boolean rankValidate(long rank) throws IllegalArgumentException {

		if (rank < 0) {

			throw new IllegalArgumentException("rank cannot be less than zero");
		}

		return true;
	}
	
//  Create a method to validate a price and store
	
	public static boolean priceValidate(double price) throws IllegalArgumentException {

		if (price < 0) {

			throw new IllegalArgumentException("price cannot be less than zero");
		}

		return true;
	}

}
