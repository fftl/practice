package strategypattern.behaviors;

import strategypattern.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("삑");
    }
}
