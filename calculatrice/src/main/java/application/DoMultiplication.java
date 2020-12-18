package application;

import model.Calculator;
import model.Multiplication;

public class DoMultiplication {

	private Multiplication multiplication;

	public Multiplication getMultiplication() {
		return multiplication;
	}



	public void setMultiplication(Multiplication multiplication) {
		this.multiplication = multiplication;
	}



	public double DoMultiplication(Calculator calculator, double number) {
		return multiplication.multiplication(calculator.getNumberDisplay(), number);
	}
	
}
