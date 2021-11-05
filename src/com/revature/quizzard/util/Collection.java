package com.revature.quizzard.util;

public interface Collection<T> {

    boolean add(T t);
    boolean contains(T t);
    boolean isEmpty();
    boolean remove(T t);
    int size();

}
