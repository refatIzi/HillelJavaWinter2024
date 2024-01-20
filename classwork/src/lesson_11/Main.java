package lesson_11;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        String argument = "hillel";
       Occurrence occurrence= new Occurrence();

        ArrayList<String> checkArr = new ArrayList<>() {
        };
        checkArr.add("Hillel");
        checkArr.add("Hillel");
        checkArr.add("may");
        checkArr.add("good");
        checkArr.add("Word");
        checkArr.add("hillel");
        checkArr.add("hillel");
        checkArr.add("hello");
        checkArr.add("hillel");
        checkArr.add("Rifat");
        checkArr.add("Odessa");
        checkArr.add("ZSU");
        checkArr.add("hillel");


        occurrence.countOccurrence(checkArr, argument);


        int[] numbers = {1, 2, 3, 4, 5,6,7,8,9,10};
        System.out.println(occurrence.toList(numbers));


        Integer[] numbersInt = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7,8,8,8,9,9,9,9,10,10,10,11,11,12,12,12,12,12};
        System.out.println(occurrence.findUnique(numbersInt));


        ArrayList<String> animals = new ArrayList<>();
        animals.add("dog");
        animals.add("dog");
        animals.add("dog");
        animals.add("dog");
        animals.add("dog");
        animals.add("dog");
        animals.add("dog");
        animals.add("dog");
        animals.add("dog");
        animals.add("fox");
        animals.add("fox");
        animals.add("fox");
        animals.add("fox");
        animals.add("fox");
        animals.add("fox");
        animals.add("fox");
        animals.add("fox");
        animals.add("cat");
        animals.add("cat");
        animals.add("cat");
        animals.add("cat");
        animals.add("cat");
        animals.add("bird");
        animals.add("bird");
        animals.add("bird");
        animals.add("bird");
        animals.add("bird");


        occurrence.calcOccurrence(animals);


        System.out.println(Occurrence.findOccurrence(animals));
    }



}