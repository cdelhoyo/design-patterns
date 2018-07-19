package es.cdelhoyo.designpatterns.strategy.exercise2;

public class RubberDuck extends Duck {

    @Override
    public void quack() {
        System.out.println("<< silence >>");
    }

    public void display() {
        System.out.println("I'm a real Rubber duck");
    }
}

