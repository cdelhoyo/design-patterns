package es.cdelhoyo.designpatterns.strategy.solution;

public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}
