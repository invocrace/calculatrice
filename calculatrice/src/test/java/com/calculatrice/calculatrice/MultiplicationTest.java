package com.calculatrice.calculatrice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Multiplication;

class MultiplicationTest {

	@Test
	void test() {
		Multiplication multiplication = new Multiplication();
		assertEquals(multiplication.multiplication(3, 3), 9);
	}

}
