package lesson_17.integer;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IntMain {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(51, 24, 38, 42, 15);

        // Підсчет среднего значения
        double srdZnachennya = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();

        System.out.println("Средне значення: " + srdZnachennya);
    }
}