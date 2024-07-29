/**
 * 6510405334
 * Kittikun Buntoyut
 */
package factories;

import adapters.GooseAdapter;
import adapters.PigeonAdapter;
import decorators.QuackCounter;
import interfaces.Quackable;
import models.*;
public class CounterDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createGoose() {
        return new QuackCounter(new GooseAdapter(new Goose()));
    }

    @Override
    public Quackable createPigeon() {
        return new QuackCounter(new PigeonAdapter(new Pigeon()));
    }
}
