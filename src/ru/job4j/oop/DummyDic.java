package ru.job4j.oop;

import java.io.DataInput;

public class DummyDic {

    public String engToRus(String eng) {
        String word = "Неизвестное слово. " + eng;
        return word;
    }

    public static void main(String[] args) {
        DummyDic dicdic = new DummyDic();
        System.out.println(dicdic.engToRus("Avadakedawra"));
    }
}
