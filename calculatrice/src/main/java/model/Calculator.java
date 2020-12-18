package model;

public class Calculator {
	
	private double numberDisplay;

	public double getNumberDisplay() {
		return numberDisplay;
	}

	public void setNumberDisplay(double numberDisplay) {
		this.numberDisplay = numberDisplay;
	}
	
	public void clearAll(Calculator calculator) {
		calculator.setNumberDisplay(0);
	}
	
	
}
