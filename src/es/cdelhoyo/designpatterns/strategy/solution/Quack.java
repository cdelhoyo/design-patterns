package es.cdelhoyo.designpatterns.strategy.solution;

public class Quack implements QuackBehavior {
	public void quack() {
		System.out.println("Quack");
	}
}
