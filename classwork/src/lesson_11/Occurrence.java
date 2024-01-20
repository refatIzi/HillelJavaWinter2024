package lesson_11;


import java.util.ArrayList;
import java.util.List;

public class Occurrence {

    private String name;
    private int occurrence;
    public Occurrence() {

    }
    public Occurrence(String name, int occurrence) {
        this.name = name;
        this.occurrence = occurrence;
    }



    public static void countOccurrence(List<String> words, String str) {

        int count = 0;
        for (String elements : words) {
            if (elements.equals(str)) count += 1;
        }
        System.out.println(count);
    }


    public static List<Integer> toList(int[] numbers) {

        ArrayList<Integer> convertedNumbersToList = new ArrayList<>();
        for (Integer number : numbers) {
            convertedNumbersToList.add(number);
        }
        return convertedNumbersToList;
    }


    public static List<Integer> findUnique(Integer[] numbers) {

        List<Integer> uniqueValues = new ArrayList<>();
        for (Integer number : numbers) {
            if (!uniqueValues.contains(number))
                uniqueValues.add(number);
        }
        return uniqueValues;
    }


    public static void calcOccurrence(List<String> animals) {
        List<String> uniqueValues = new ArrayList<>();

        for (String animal : animals) {
            int counter = 0;
            if (uniqueValues.contains(animal)) continue;
            else uniqueValues.add(animal);
            for (String words2 : animals) {
                if (animal.equals(words2)) counter++;
            }
            System.out.println(animal + " = " + counter);
        }
    }
    public static List<Occurrence> findOccurrence(List<String> occurrences) {

        List<String> uniqueArg = new ArrayList<>();
        List<Occurrence> uniqueOccurrences = new ArrayList<>();

        for (String arg : occurrences) {
            int counter = 0;
            if (uniqueArg.contains(arg)) continue;
            else uniqueArg.add(arg);
            for (String values2 : occurrences)
                if (arg.equals(values2)) counter++;
            uniqueOccurrences.add(new Occurrence(arg, counter));
        }
        return uniqueOccurrences;
    }

    @Override
    public String toString() {
        return "\nOccurrence { " +
                "name=' " + name +
                ", occurrence: " + occurrence +
                " }"+'\n';
    }
}
