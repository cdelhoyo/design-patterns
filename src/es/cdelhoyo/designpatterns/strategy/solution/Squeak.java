package es.cdelhoyo.designpatterns.strategy.solution;

public class Squeak implements QuackBehavior {
	public void quack() {
		System.out.println("Squeak");
	}
}
