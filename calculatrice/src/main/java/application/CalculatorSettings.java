package application;

import model.Calculator;

public class CalculatorSettings {
	
	private Calculator calculator;

	public void addNumbers(double number) {
		calculator.setNumberDisplay(number);
	
	}
}
