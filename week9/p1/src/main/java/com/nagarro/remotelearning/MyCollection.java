package com.nagarro.remotelearning;

import java.util.Collection;

public interface MyCollection<T> {
    boolean containsAll(Collection<T> c);
    boolean addAll(Collection<? extends T> c);
}
