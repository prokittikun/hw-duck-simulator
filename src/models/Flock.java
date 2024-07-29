/**
 * 6510405334
 * Kittikun Buntoyut
 */
package models;

import interfaces.Quackable;

import java.util.ArrayList;

public class Flock implements Quackable {
    ArrayList<Quackable> ducks = new ArrayList<>();
    Quackable leader;

    public void add(Quackable duck) {
        if (leader == null) {
            leader = duck;
        }
        ducks.add(duck);
    }

    @Override
    public void quack() {
        if (leader != null) {
            leader.quack();
            leader.quack();
            leader.quack();
            System.out.println();
        }
        for (Quackable duck : ducks) {
            if (duck != leader) {
                duck.quack();
                System.out.println();
            }
        }
    }
}
