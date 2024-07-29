/**
 * 6510405334
 * Kittikun Buntoyut
 */
package models;

import interfaces.Quackable;

public class MallardDuck implements Quackable {
    @Override
    public void quack() {
        System.out.print("Quack");
    }
}
