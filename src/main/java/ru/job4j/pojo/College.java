package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Pavel");
        student.setDate(new Date());
        student.setGroup("BPM-15");
        System.out.println(student.getName() + " " + student.getGroup() + " " + student.getDate());

    }
}
