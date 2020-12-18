package application;

import model.Calculator;
import model.Sum;

public class DoSum {
	private Sum sum;

	public Sum getSum() {
		return sum;
	}

	public void setSum(Sum sum) {
		this.sum = sum;
	}

	public double doSum(double number, Calculator calculator) {
		return sum.addition(number, calculator.getNumberDisplay());
	}

}
