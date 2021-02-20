package ru.job4j.collection;

import java.util.Comparator;

public class ComparatorDepsReverse implements Comparator<String> {
    @Override
    public int compare(String one, String two) {
        int a = two.split("/")[0].compareTo(one.split("/")[0]);
        if (a == 0 && two.split("/").length != 1 && one.split("/").length != 1) {
            a = one.split("/", 2)[1].compareTo(two.split("/", 2)[1]);
        } else if (a == 0) {
            a = Integer.compare(one.length(), two.length());
        }
    return a;
    }
}
