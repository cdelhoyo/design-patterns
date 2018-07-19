package es.cdelhoyo.designpatterns.strategy.exercise1;


public abstract class Duck {

	abstract void display();

	public void quack() {
		System.out.println("quack!");
	}

	public void swim() {
		System.out.println("swim!");
	}
}
