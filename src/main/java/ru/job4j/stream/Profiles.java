package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(x -> x.getAddress())
                .sorted(new ComparatorAddress())
                .distinct()
                .collect(Collectors.toList());
    }
}
