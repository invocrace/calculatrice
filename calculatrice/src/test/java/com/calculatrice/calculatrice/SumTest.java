package com.calculatrice.calculatrice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Sum;

class SumTest {

	@Test
	void test() {
		Sum sum = new Sum();
		assertEquals(sum.addition(1,1), 2);
	}

}
