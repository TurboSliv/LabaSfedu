package ru.sfedu.common;

public interface List<T> extends Collection<T> {
    T get(int index);

    void set(int index, T value);
}
