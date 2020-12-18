package application;

import model.Calculator;
import model.Substraction;

public class DoSubstraction {
	
	private Substraction substraction;
	
	public double doSubstraction(Calculator calculator, double number) {
		return substraction.substraction(calculator.getNumberDisplay(), number);
	}
}
