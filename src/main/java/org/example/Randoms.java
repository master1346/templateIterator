package org.example;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private final int min;
    private final int max;


    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        random = new Random();
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int next = 0;
            int r;

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                if(hasNext()) {
                    r = random.nextInt((max - min) + 1 ) + min;
                    return r;
                }
               return null;
            }

            @Override
            public void remove() {
            }
        };
    }
}