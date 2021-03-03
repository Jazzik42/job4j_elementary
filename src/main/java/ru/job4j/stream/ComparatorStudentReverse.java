package ru.job4j.stream;

import java.util.Comparator;

public class ComparatorStudentReverse implements Comparator<Student> {

    @Override
    public int compare(Student left, Student right) {
        return Integer.compare(right.getScore(), (left.getScore()));
    }
}
