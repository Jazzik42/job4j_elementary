package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public static HashSet<String> extractNumber(List<TaskTask> list) {
        HashSet<String> numbers = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            numbers.add(list.get(i).getNumber());
        }
        return numbers;
    }
}