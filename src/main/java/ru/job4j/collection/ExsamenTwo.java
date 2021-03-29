package ru.job4j.collection;


    import java.util.HashMap;
    import java.util.List;
    import java.util.function.Function;
    import java.util.stream.Collectors;
    import java.util.stream.Stream;

public class ExsamenTwo {
        public static boolean eq(String left, String right) {
            HashMap<Character, Long> map = new HashMap<>();
            Stream<Character> chars = left.chars().mapToObj(i -> (char) i);
            map.putAll(chars.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
            List<Character> rightChars = right.chars()
                    .mapToObj(i -> Character.valueOf((char) i))
                    .collect(Collectors.toList());
            for (char i : rightChars) {
                if (!map.containsKey(i)) {
                    return false;
                } else if (map.containsKey(i) && map.get(i) == 1) {
                        map.remove(i);
                    } else if (map.containsKey(i) && map.get(i) > 1) {
                        map.put(i, map.get(i) - 1);
                    }
                    }
            return map.isEmpty();
            }
    }

