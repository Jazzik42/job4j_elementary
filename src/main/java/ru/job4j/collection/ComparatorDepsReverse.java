package ru.job4j.collection;

import java.util.Comparator;

public class ComparatorDepsReverse implements Comparator<String> {
    @Override
    public int compare(String one, String two) {
        int a = two.split("/")[0].compareTo(one.split("/")[0]);
        return a == 0 ? one.compareTo(two) : a;
        }
    }

