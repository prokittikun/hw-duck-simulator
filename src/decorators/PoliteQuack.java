/**
 * 6510405334
 * Kittikun Buntoyut
 */
package decorators;

import interfaces.Quackable;

public class PoliteQuack implements Quackable {
    Quackable politeDuct;

    public PoliteQuack(Quackable politeDuct) {
        this.politeDuct = politeDuct;
    }

    @Override
    public void quack() {
        politeDuct.quack();
        System.out.print(" ja ");
    }
}
