package com.calculatrice.calculatrice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Division;

class DivisionTest {

	@Test
	void test() {
		Division division = new Division();
		assertEquals(division.division(3, 3), 1);
	}
	

}
