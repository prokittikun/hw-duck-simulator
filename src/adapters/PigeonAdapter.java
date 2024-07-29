/**
 * 6510405334
 * Kittikun Buntoyut
 */
package adapters;

import interfaces.Quackable;
import models.Pigeon;

public class PigeonAdapter implements Quackable {
    private Pigeon pigeon;

    public PigeonAdapter(Pigeon pigeon) {
        this.pigeon = pigeon;
    }

    @Override
    public void quack() {
        pigeon.coo();
        pigeon.coo();
    }
}
