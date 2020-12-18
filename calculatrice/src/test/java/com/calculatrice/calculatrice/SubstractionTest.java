package com.calculatrice.calculatrice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Substraction;

class SubstractionTest {

	@Test
	void test() {
	Substraction substraction = new Substraction();
	assertEquals(substraction.substraction(2, 1), 1);
	}

}
