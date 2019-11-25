package com.vates.modulo.III.clases;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class CustomIterableImpl implements Iterable<Integer> {
    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {

    }

    @Override
    public Spliterator<Integer> spliterator() {
        return null;
    }
}
