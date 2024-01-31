package lesson_17.filter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class FilterMain {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "two", "three", "Four", "FIVE","six","abby","seven","mama");

        // Фільтрація
        List<String> filteredStrings = strings.stream()
                .filter(s -> s.length() == 4 && s.equals(s.toLowerCase()))
                .toList();

        // Вивід
        for (String string : filteredStrings) {
            System.out.println(string);
        }
    }
}
