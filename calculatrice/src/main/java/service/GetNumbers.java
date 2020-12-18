package service;

import application.CalculatorSettings;
import application.DoMultiplication;
import application.DoSum;
import model.Calculator;

public class GetNumbers {
	
	CalculatorSettings calculatorSettings;

	public double addNumber(double number) {
		return calculatorSettings.addNumbers(number);
	}
	

}
