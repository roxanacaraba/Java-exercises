package com.nagarro.remotelearning;

import java.util.Collection;

public class GenericCollection<T> implements MyCollection<T> {
    private Collection<T> collection;
    public GenericCollection(Collection<T> collection) {
        this.collection = collection;
    }

    @Override
    public boolean containsAll(Collection<T> c) {

        return this.collection.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {

        return this.collection.addAll(c);
    }
}
