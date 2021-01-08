package ru.job4j.oop;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double period(double ab, double bc, double ca) {
        return (ab + bc + ca) / 2;
    }

    public boolean check(double ab, double bc, double ca) {
        return ((ab + bc > ca && ab + ca > bc && ca + bc > ab));
    }

    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double bc = second.distance(third);
        double ca = third.distance(first);
        double p = period(ab, bc, ca);
        if (this.check(ab, bc, ca)) {
           rsl = Math.sqrt(p * (p - ab) * (p - bc) * (p - ca));
        }
        return rsl;
    }

}