package es.cdelhoyo.designpatterns.factory.exercise2;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore store = new PizzaStore();

		Pizza pepperoniPizza = store.orderPizza("pepperoni");
		System.out.println("We ordered a " + pepperoniPizza.getName() + "\n");
		System.out.println(pepperoniPizza);


		Pizza cheesePiza = store.orderPizza("cheese");
		System.out.println("We ordered a " + cheesePiza.getName() + "\n");
		System.out.println(cheesePiza);


		Pizza clamPizza = store.orderPizza("clam");
		System.out.println("We ordered a " + clamPizza.getName() + "\n");
		System.out.println(clamPizza);

	}
}
