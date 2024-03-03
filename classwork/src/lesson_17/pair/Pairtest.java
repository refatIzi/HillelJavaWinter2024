package lesson_17.pair;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class Pairtest {

    @Test
    public void testPairConversion() {
        List<String> strings = Arrays.asList("one", "two", "three");

        List<Pair> testPairs = Arrays.asList(
                new Pair("one", "ONE"),
                new Pair("two", "TWO"),
                new Pair("three", "THREE")
        );

        List<Pair> officialPairs = strings.stream()
                .map(s -> new Pair(s, s.toUpperCase()))
                .toList();

        // Порівняння елементів
        for (int i = 0; i < testPairs.size(); i++) {
            assertEquals(testPairs.get(i).toString(), officialPairs.get(i).toString());
        }
    }
    }
