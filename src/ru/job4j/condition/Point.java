package ru.job4j.condition;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point another) {

        return Math.sqrt(Math.pow((this.x - another.x), 2) + Math.pow((this.y - another.y), 2));
    }

    public double distance3D(Point another) {
        return Math.sqrt(Math.pow((this.x - another.x), 2) + Math.pow((this.y - another.y), 2) + Math.pow((this.z - another.z), 2));
    }

    public static void main(String[] args) {
        Point dot1 = new Point(2, 4, 3);
        Point dot2 = new Point(2, 3, 5);
        System.out.println(dot1.distance3D(dot2));

    }
    }