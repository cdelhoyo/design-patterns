package es.cdelhoyo.designpatterns.factory.sol1simple;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class SimplePizzaFactory2 {

    final static Map<String, Supplier<Pizza>> factoryMap = new HashMap<>();
    static {
        factoryMap.put("cheese", CheesePizza::new);
        factoryMap.put("pepperoni", PepperoniPizza::new);
        factoryMap.put("clam", ClamPizza::new);
        factoryMap.put("veggie", VeggiePizza::new);
    }

    public Pizza createPizza(String type) {
        Supplier<Pizza> supplierPizza = factoryMap.get(type);
        return supplierPizza.get();
    }
}


