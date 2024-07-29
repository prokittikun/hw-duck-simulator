/**
 * 6510405334
 * Kittikun Buntoyut
 */

import decorators.QuackCounter;
import factories.CounterAndPoliteDuckFactory;
import factories.CounterDuckFactory;
import factories.SimpleDuckFactory;

public class Main {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();

        System.out.println("No Decorators:");
        simulator.simulate(new SimpleDuckFactory());
        QuackCounter.resetCount();

        System.out.println("\nCounter Decorators:");
        simulator.simulate(new CounterDuckFactory());
        QuackCounter.resetCount();

        System.out.println("\nCounter and Polite Decorators:");
        simulator.simulate(new CounterAndPoliteDuckFactory());
    }
}