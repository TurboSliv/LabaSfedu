package ru.sfedu.utils;

import ru.sfedu.common.List;

import java.util.Random;

public class RandomListGenerator<T extends Number> {
    Random random = new Random();

    public void generate(List<T> list, int count, double min, double max) {
        //list.append((T)(Object)((max-min) * random.nextDouble() + min));
    }
}
