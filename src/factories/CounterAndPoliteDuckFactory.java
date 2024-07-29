/**
 * 6510405334
 * Kittikun Buntoyut
 */
package factories;

import adapters.GooseAdapter;
import adapters.PigeonAdapter;
import decorators.PoliteQuack;
import decorators.QuackCounter;
import interfaces.Quackable;
import models.*;

public class CounterAndPoliteDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new PoliteQuack(new MallardDuck()));
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new PoliteQuack(new RedheadDuck()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new PoliteQuack(new RubberDuck()));
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new PoliteQuack(new DuckCall()));
    }

    @Override
    public Quackable createGoose() {
        return new QuackCounter(new PoliteQuack(new GooseAdapter(new Goose())));
    }

    @Override
    public Quackable createPigeon() {
        return new QuackCounter(new PoliteQuack(new PigeonAdapter(new Pigeon())));
    }
}

