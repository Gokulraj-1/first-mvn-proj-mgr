package com.fssa.mgr.project;

public class Currency { // create a  public class

	
	// Declare the variables
	int id;
	String name;
	String symbol;
	long rank;
	double price;

	
	// create  a Getters and Setters
	public void setId(int id) { // create a method to Set id
		this.id = id;
	}

	public int getId() { // create a method to get id
		return id;
	}

	public void setName(String name) { // create a method to Set name
		this.name = name;
	}

	public String getName() { // create a method to get name
		return name;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public void setRank(int rank) { // create a method to Set id
		this.rank = rank;
	}

	public long getRank() { // create a method to get id
		return  rank;
	}
	
	public void setPrice(double price) { // create a method to Set id
		this.price = price;
	}

	public double getPrice() { // create a method to get id
		return price;
	}
	
}
