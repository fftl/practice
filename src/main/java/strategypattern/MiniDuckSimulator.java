package strategypattern;

import strategypattern.behaviors.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck toy = new ToyDuck();
        toy.performQuack();
        toy.performFly();
        toy.setFlyBehavior(new FlyRocketPowered());
        toy.performFly();
    }
}
