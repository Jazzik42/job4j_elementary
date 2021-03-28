package ru.job4j.collection;

import java.util.HashSet;

public class Exsamen {
    public static boolean generateBy(String origin, String line) {
        boolean originality = true;
        HashSet<String> wordsOrig = new HashSet<>();
        for (String strOrigin : origin.split("\\s*(\\s|,|!|\\.)\\s*")) {
            wordsOrig.add(strOrigin);
        }
        for (String strLine : line.split("\\s*(\\s|,|!|\\.)\\s*")) {
            if (!wordsOrig.contains(strLine)) {
                originality = false;
                break;
            }
        }
        return originality;
    }
}
