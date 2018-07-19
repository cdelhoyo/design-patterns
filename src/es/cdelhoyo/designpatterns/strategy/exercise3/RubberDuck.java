package es.cdelhoyo.designpatterns.strategy.exercise3;

public class RubberDuck extends Duck {

    @Override
    public void quack() {
        System.out.println("<< silence >>");
    }

    @Override
    public void fly() {
        System.out.println("<< nothing >>");
    }

    public void display() {
        System.out.println("I'm a real Rubber duck");
    }
}

