package ru.job4j.array;

import java.util.List;
import java.util.stream.Collectors;

public class StreamArray {
    public static void main(String[] args) {
        List<Integer> list = List.of(
                1, 2, 3, -4, -5, 6, -8
        );
        list.stream().filter(x -> x > 0).collect(Collectors.toList()).forEach(System.out::println);
    }
    }
