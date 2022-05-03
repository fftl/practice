package strategypattern;

import strategypattern.Duck;
import strategypattern.behaviors.FlyWithWings;
import strategypattern.behaviors.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("mallardDuck 입니당.");
    }

}
