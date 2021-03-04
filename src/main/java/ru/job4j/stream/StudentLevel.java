package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentLevel {
    public static List<Student> levelOf(List<Student> students, int bound) {
        Comparator<Student> comp = Comparator.comparing(st -> st.getScore());

        return students.stream()
                    .filter(st -> st != null)
                .sorted(comp.reversed())
                .takeWhile(st -> st.getScore() > bound)
                .collect(Collectors.toList());
    }
}