package es.cdelhoyo.designpatterns.strategy.exercise3;


public abstract class Duck {

	abstract void display();

	public void quack() {
		System.out.println("quack!");
	}

	public void swim() {
		System.out.println("swim!");
	}

	public void fly() {
		System.out.println("fly!");
	}
}
