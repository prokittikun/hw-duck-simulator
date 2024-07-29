/**
 * 6510405334
 * Kittikun Buntoyut
 */
package adapters;

import interfaces.Quackable;
import models.Goose;

public class GooseAdapter implements Quackable {
    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
