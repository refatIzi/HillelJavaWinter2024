package lesson_17.integer;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
public class SrdZnach {
    @Test
    public void testAverage() {
        List<Integer> numbers = Arrays.asList(51, 24, 38, 42, 15);

        double srd = 34.0;
        double srdZnachennya = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();

        assertEquals(srd, srdZnachennya, 0.001);
    }
}