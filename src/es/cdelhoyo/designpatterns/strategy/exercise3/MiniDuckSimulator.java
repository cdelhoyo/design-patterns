package es.cdelhoyo.designpatterns.strategy.exercise3;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        MallardDuck mallard = new MallardDuck();
        act(mallard);

        RedHeadDuck redHead = new RedHeadDuck();
        act(redHead);

        RubberDuck rubber = new RubberDuck();
        act(rubber);
    }

    private static void act(Duck duck){
        duck.display();
        duck.swim();
        duck.quack();
        duck.fly();
    }
}
