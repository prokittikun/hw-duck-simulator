/**
 * 6510405334
 * Kittikun Buntoyut
 */
package factories;

import interfaces.Quackable;

public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createRubberDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createGoose();
    public abstract Quackable createPigeon();

}
