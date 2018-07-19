package es.cdelhoyo.designpatterns.decorator.exercise2;

public class Beverage {

	String description = "Unknown Beverage";
	double milkCost = .10;
	double soyCost = .15;
	double mochaCost = .20;
	double whipCost = .10;

	boolean milk;
	boolean soy;
	boolean mocha;
	boolean whip;
  
	public String getDescription() {
		return description;
	}
 
	public double cost(){
		double condimentCost = .0;
		if (hasMilk()) {
			condimentCost += milkCost;
		}
		if (hasSoy()) {
			condimentCost += soyCost;
		}
		if (hasMocha()) {
			condimentCost += mochaCost;
		}
		if (hasWhip()) {
			condimentCost += whipCost;
		}
		return condimentCost;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean hasMilk() {
		return milk;
	}

	public void setMilk(boolean milk) {
		this.milk = milk;
	}

	public boolean hasSoy() {
		return soy;
	}

	public void setSoy(boolean soy) {
		this.soy = soy;
	}

	public boolean hasMocha() {
		return mocha;
	}

	public void setMocha(boolean mocha) {
		this.mocha = mocha;
	}

	public boolean hasWhip() {
		return whip;
	}

	public void setWhip(boolean whip) {
		this.whip = whip;
	}
}
