package strategypattern;

import strategypattern.behaviors.FlyNoWay;
import strategypattern.behaviors.Quack;
import strategypattern.behaviors.Squeak;

public class ToyDuck extends Duck{
    public ToyDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다.");
    }
}
