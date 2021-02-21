package ru.job4j.collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        Set<String> buffer = new LinkedHashSet<>();
        for (String depart : deps) {
            String start = depart.split("/")[0];
            buffer.add(start);
           for (String value : depart.split("/")) {
               if (!value.equals(start)) {
                   start = start + "/" + value;
                   buffer.add(start);
           }
           }
        }
        return new ArrayList<>(buffer);
    }

    public static void sortAsc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }

    public static void sortDesc(List<String> orgs) {
        orgs.sort(new ComparatorDepsReverse());
}
}
