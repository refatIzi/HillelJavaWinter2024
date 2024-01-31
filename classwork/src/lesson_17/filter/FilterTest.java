package lesson_17.filter;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;
public class FilterTest {

    @Test
    public void testFilter() {
        List<String> strings = Arrays.asList("one", "two", "three", "Four", "FIVE","six","abby","seven","mama");

        List<String> expectedStrings = Arrays.asList("abby", "mama");

        // Фільтрація
        List<String> actualStrings = strings.stream()
                .filter(s -> s.length() == 4 && s.equals(s.toLowerCase()))
                .collect(Collectors.toList());
System.out.println(actualStrings);
        for (int i = 0; i < expectedStrings.size(); i++) {
            assertEquals(expectedStrings.get(i), actualStrings.get(i));
        }
    }
}