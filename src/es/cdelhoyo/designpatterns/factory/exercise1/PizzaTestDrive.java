package es.cdelhoyo.designpatterns.factory.exercise1;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore store = new PizzaStore();

		Pizza pizza = store.orderPizza();
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);

	}
}
