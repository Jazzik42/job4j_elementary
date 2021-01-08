package ru.job4j.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point another) {

        return Math.sqrt(Math.pow((this.x - another.x), 2) + Math.pow((this.y - another.y), 2));
    }

    public static void main(String[] args) {
        Point dot = new Point(2, 4);
        Point dot2 = new Point(3, 5);
        System.out.println("result2 (2, 3) to (4, 5) " + dot.distance(dot2));
        }
}
