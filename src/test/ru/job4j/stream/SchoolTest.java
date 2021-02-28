package ru.job4j.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SchoolTest {
    private List<Student> students = new ArrayList<>();

    @Before
    public void setUp() {
        students.add(new Student(10, "Surname1"));
        students.add(new Student(20, "Surname2"));
        students.add(new Student(30, "Surname3"));
        students.add(new Student(40, "Surname4"));
        students.add(new Student(50, "Surname5"));
        students.add(new Student(60, "Surname6"));
        students.add(new Student(70, "Surname7"));
        students.add(new Student(80, "Surname8"));
        students.add(new Student(90, "Surname9"));
    }

    @Test
    public void test1() {
        School sc = new School();
        Predicate<Student> pr = x -> x.getScore() >= 70;
        List<Student> list = List.of(
                new Student(70, "Surname7"),
                new Student(80, "Surname8"),
                new Student(90, "Surname9")
        );
        sc.collect(students, pr);
        assertThat(sc.collect(students, pr), is(list));
    }

    @Test
    public void whenCollectClassB() {
        School sc = new School();
        Predicate<Student> pr = x -> x.getScore() >= 50 && x.getScore() < 70;
        List<Student> rsl = sc.collect(students, pr);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student(50, "Surname5"));
        expected.add(new Student(60, "Surname6"));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCollectClassC() {
        School sc = new School();
        Predicate<Student> pr = x -> x.getScore() < 50;
        List<Student> rsl = sc.collect(students, pr);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student(10, "Surname1"));
        expected.add(new Student(20, "Surname2"));
        expected.add(new Student(30, "Surname3"));
        expected.add(new Student(40, "Surname4"));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCollectMap() {
        School sc = new School();
        HashMap<String, Student> studentsMap = new HashMap<>();
        studentsMap.put("Surname1", new Student(10, "Surname1"));
        studentsMap.put("Surname2", new Student(20, "Surname2"));
        studentsMap.put("Surname3", new Student(30, "Surname3"));
        studentsMap.put("Surname4", new Student(40, "Surname4"));
        studentsMap.put("Surname5", new Student(50, "Surname5"));
        studentsMap.put("Surname6", new Student(60, "Surname6"));
        studentsMap.put("Surname7", new Student(70, "Surname7"));
        studentsMap.put("Surname8", new Student(80, "Surname8"));
        studentsMap.put("Surname9", new Student(90, "Surname9"));
       assertThat(sc.collectMap(students), is(studentsMap));
    }
}
