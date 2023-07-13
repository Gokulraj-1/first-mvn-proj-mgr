package com.fssa.mgr.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCurrencyValidation {

	@Test
	public void testNameValidate() {

		Assertions.assertTrue(CurrencyValidator.nameValidate("Gokul"));

	}

	@Test
	public void testNameInvalid() {

		try {

			CurrencyValidator.nameValidate("   ");

			Assertions.fail("method failed");

		} catch (IllegalArgumentException ex) {

			Assertions.assertEquals("Invalid name. Name cannot be null or Empyty.",ex.getMessage());
		}
	}

	@Test
	void testSymbolValidate() {
		Assertions.assertTrue(CurrencyValidator.symbolValidate("GTC"));
	}


	@Test
	void testSymbolInvalid() {

		try {

			CurrencyValidator.symbolValidate("    ");

			Assertions.fail("method failed");

		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Invalid Symbol. Symbol cannot be null or Empty.", ex.getMessage());
		}
	}
	
	
	@Test
	void testIdValidate() {
		Assertions.assertTrue(CurrencyValidator.idValidate(43));

	}


	@Test
	void testIdInvalid() {

		try {

			CurrencyValidator.idValidate(-32);

			Assertions.fail("method failed");

		} 
		catch (IllegalArgumentException e) {
			Assertions.assertEquals("Id cannot be less than zero", e.getMessage());
		}
	}
	
	
	
	@Test
	void testRankValidate() {
		Assertions.assertTrue(CurrencyValidator.rankValidate(43));

	}
	

	@Test
	void testRankInvalid() {

		try {

			CurrencyValidator.rankValidate(-32);

			Assertions.fail("method failed");

		} 
		catch (IllegalArgumentException e) {
			Assertions.assertEquals("rank cannot be less than zero", e.getMessage());
		}
	}
	
	
	
	@Test
	void testPriceValidate() {
		Assertions.assertTrue(CurrencyValidator.priceValidate(43));

	}
	

	@Test
	void testPriceInvalid() {

		try {

			CurrencyValidator.priceValidate(-32);

			Assertions.fail("method failed");

		} 
		catch (IllegalArgumentException e) {
			Assertions.assertEquals("price cannot be less than zero", e.getMessage());
		}
	}

}
