package es.cdelhoyo.designpatterns.strategy.solution;

public class FlyRocketPowered implements FlyBehavior {
	public void fly() {
		System.out.println("I'm flying with a rocket");
	}
}
