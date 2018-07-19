package es.cdelhoyo.designpatterns.strategy.solution;

public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
