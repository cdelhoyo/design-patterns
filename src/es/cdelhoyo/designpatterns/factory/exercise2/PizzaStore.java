package es.cdelhoyo.designpatterns.factory.exercise2;

public class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza pizza;

		// Not closed
		if(type.equals("cheese")){
			pizza = new CheesePizza();
		}else if(type.equals("pepperoni")){
			pizza = new PepperoniPizza();
		}else if(type.equals("clam")){
			pizza = new ClamPizza();
		}else{
			throw new RuntimeException();
		}

		// expected to stay the same
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
