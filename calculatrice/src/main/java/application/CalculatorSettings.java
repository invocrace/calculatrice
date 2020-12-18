package application;

import model.Calculator;

public class CalculatorSettings {
	
	private Calculator calculator;


	public double addNumbers(double number) {
		calculator.setNumberDisplay(number);
		return number;
	}
	
	public void clearAll() {
		calculator.clearAll(calculator);
	}
}
