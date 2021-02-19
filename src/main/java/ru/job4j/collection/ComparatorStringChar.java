package ru.job4j.collection;

import java.util.Comparator;

public class ComparatorStringChar implements Comparator<String> {

    @Override
    public int compare(String first, String second) {
        int index = Math.min(first.length(), second.length());
        int a = 0;
            for (int i = 0; i < index; i++) {
                a = Character.compare(first.charAt(i), second.charAt(i));
                if (a != 0) {
                    break;
                }
            }
            if (a == 0 && first.length() != second.length()) {
                a = Integer.compare(first.length(), second.length());
            }
        return a;
    }
}
