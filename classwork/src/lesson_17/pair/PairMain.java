package lesson_17.pair;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PairMain {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "two", "three");

        // Преобразование в List<Pair>
        List<Pair> pairs = strings.stream()
                .map(s -> new Pair(s, s.toUpperCase()))
                .toList();

        // Вывод
        for (Pair pair : pairs) {
            System.out.println(pair);
        }
    }
}
