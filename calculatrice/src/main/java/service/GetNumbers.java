package service;

import application.CalculatorSettings;
import application.DoMultiplication;
import application.DoSubstraction;
import application.DoSum;
import model.Calculator;
import model.Multiplication;
import model.Substraction;

public class GetNumbers {
	
	private Calculator calculator;
	private CalculatorSettings calculatorSettings;
	private DoSum doSum;
	private DoMultiplication doMultiplication;
	private DoSubstraction doSubstraction;
	
	
	

	public double addNumber(double number) {
		return calculatorSettings.addNumbers(number);
	}
	
	public double addtion(double number) {
		return doSum.doSum(number, calculator);
	}
	
	public double multiplication(double number) {
		return doMultiplication.doMultiplication(calculator, number);
	}
	
	public void clearCalculator() {
		calculatorSettings.clearAll();
	}
	
	public double substraction(double number) {
		return doSubstraction.doSubstraction(calculator, number);
	}
	

}
