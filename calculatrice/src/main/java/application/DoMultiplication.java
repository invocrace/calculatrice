package application;

import model.Calculator;
import model.Multiplication;

public class DoMultiplication {
	private double number;
	private Calculator calculator;
	private Multiplication multiplication;
	
	public double DoMultiplication(Calculator calculator, Multiplication multiplication) {
		return multiplication.multiplication(calculator.getNumberDisplay(), number);
	}
	
}
