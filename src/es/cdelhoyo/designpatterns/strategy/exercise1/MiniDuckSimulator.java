package es.cdelhoyo.designpatterns.strategy.exercise1;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        MallardDuck	mallard = new MallardDuck();
        mallard.swim();
        mallard.quack();
        mallard.display();

        RedHeadDuck	redHead = new RedHeadDuck();
        redHead.swim();
        redHead.quack();
        redHead.display();


    }
}
