package com.fssa.mgr.day18.solved;

public class ValidationUtil { // create a class

	public static boolean validateAge(int age) throws IllegalArgumentException { // create a method to validate age or
																					// throw a exception
		if (age <= 0) {// Check if the age is a positive value
			throw new IllegalArgumentException("Invalid age");

		} else {
			return true;
		}
	}
}