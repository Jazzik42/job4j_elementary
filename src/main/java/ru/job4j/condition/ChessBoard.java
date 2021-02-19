package ru.job4j.condition;

public class ChessBoard {
     public static int way(int x1, int y1, int x2, int y2) {
            int rsl1 = 0;
            if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
                rsl1 = Math.abs(x2 - x1);
                            }
            return rsl1;
        }

    public static void main(String[] args) {
        int rsl = way(2, 6, 4, 1);
        System.out.println(rsl);
    }
    }

