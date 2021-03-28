package ru.job4j.collection;


    import java.util.HashMap;
    import java.util.function.Function;
    import java.util.stream.Collectors;
    import java.util.stream.Stream;

public class ExsamenTwo {
        public static boolean eq(String left, String right) {
            HashMap<Character, Long> map = new HashMap<>();
            HashMap<Character, Long> rightMap = new HashMap<>();
            Stream<Character> chars = left.chars().mapToObj(i -> (char) i);
            Stream<Character> rightChars = right.chars().mapToObj(i -> (char) i);
            map.putAll(chars.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
            rightMap.putAll(rightChars.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

            return map.equals(rightMap);
        }
    }

