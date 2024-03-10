package com.example.effectivejava.ch2.item8;

import java.lang.ref.Cleaner;

/*
* item8 : finalizer 와 cleaner 사용을 피하라
*/
public class Room implements AutoCloseable {
    private static final Cleaner CLEANER = Cleaner.create();

    private final State state;
    private final Cleaner.Cleanable cleanable;

    public Room(final int numJunkPiles) {
        this.state = new State(numJunkPiles);
        this.cleanable = CLEANER.register(this, state);
    }

    private static class State implements Runnable {
        int numJunkPiles;

        State(final int numJunkPiles) {
            this.numJunkPiles = numJunkPiles;
        }

        @Override
        public void run() {
            System.out.println("방 청소");
            numJunkPiles = 0;
        }
    }

    @Override
    public void close() {
        cleanable.clean();
    }
}
