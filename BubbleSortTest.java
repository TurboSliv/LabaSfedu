package ru.sfedu.algorithms;

import org.junit.Assert;
import org.junit.Test;
import ru.sfedu.common.List;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void sort() {
        final class ListStub implements List<Integer> {
            private Integer[] array = new Integer[] {8, 1, 5, 7, 10, 2, 0, 0};

            @Override
            public int getCount() {
                return array.length;
            }

            @Override
            public Integer get(int index) {
                return array[index];
            }

            @Override
            public void set(int index, Integer value) {
                array[index] = value;
            }

            public Integer[] getArray() {
                return array;
            }
        }

        ListStub list = new ListStub();
        BubbleSort<Integer> sort = new BubbleSort<>();

        sort.sort(list);

        Assert.assertArrayEquals(
                new Integer[] {0, 0, 1, 2, 5, 7, 8, 10},
                list.getArray());
    }

    @Test
    public void boxing_unboxing() {
        double d = 2.0;
        int di = (int) d;
        Object o = (Object) d;
        Integer i = (Integer) o;

        Assert.assertEquals(i, (Integer) di);
    }
}