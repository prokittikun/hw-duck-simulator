package factories;

import adapters.GooseAdapter;
import adapters.PigeonAdapter;
/**
 * 6510405334
 * Kittikun Buntoyut
 */
import interfaces.Quackable;
import models.*;

public class SimpleDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }

    @Override
    public Quackable createPigeon() {
        return new PigeonAdapter(new Pigeon());
    }
}
