package service;

import application.DoMultiplication;
import application.DoSum;
import model.Calculator;

public class GetNumber {
	
	private double number;
	private DoSum addition;
	private DoMultiplication multiplication;
	private Calculator calculator;
	
	public double getNumberAddition(double number) {
		return addition.doSum(number, calculator);
		
	}
}
