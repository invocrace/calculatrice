package application;

import model.Calculator;
import model.ClearAll;

public class CalculatorSettings {
	
	private Calculator calculator;
	private ClearAll clearAll;

	public double addNumbers(double number) {
		calculator.setNumberDisplay(number);
		return number;
	}
	
	public void clearAll() {
		clearAll.clearAll(calculator);
	}
}
