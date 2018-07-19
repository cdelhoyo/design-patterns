package es.cdelhoyo.designpatterns.decorator.exercise2;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}
 
	public double cost() {
		return .89 + super.cost();
	}
}

