/**
 * 6510405334
 * Kittikun Buntoyut
 */
import decorators.QuackCounter;
import factories.AbstractDuckFactory;
import models.Flock;

public class DuckSimulator {
    public void simulate(AbstractDuckFactory duckFactory) {
        Flock flock = new Flock();

        flock.add(duckFactory.createMallardDuck());
        flock.add(duckFactory.createRedheadDuck());
        flock.add(duckFactory.createRubberDuck());
        flock.add(duckFactory.createDuckCall());
        flock.add(duckFactory.createGoose());
        flock.add(duckFactory.createPigeon());

        System.out.println("Flock Quacking:");
        flock.quack();

        System.out.println("Quack Count: " + QuackCounter.getCount());
    }
}
