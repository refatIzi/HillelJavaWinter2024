package lesson_04;


/**
 * 1. Створити порожній проект у IntelliJ IDEA, створити клас HomeWorkApp і прописати в ньому метод main().
 * <p>
 * 2. Створіть метод printThreeWords(), який під час виклику повинен надрукувати в стовпець у три слова: Orange, Banana, Apple.
 * <p>
 * Orange
 * <p>
 * Banana
 * <p>
 * Apple
 * <p>
 * 3. +Створіть метод checkSumSign(), у тілі якого оголосіть дві int змінні a і b, та ініціалізуйте їх будь-якими значеннями, якими захочете. Далі метод повинен підсумувати ці змінні, і якщо їх сума більша або дорівнює 0, то вивести в консоль повідомлення "Сума позитивна", інакше - "Сума негативна";
 * <p>
 * 4. +Створіть метод printColor() у тілі якого задайте int змінну value та ініціалізуйте її будь-яким значенням. Якщо значення менше 0 (0 включно), то в консоль метод повинен вивести повідомлення "Червоний", якщо лежить в межах від 0 (0 виключно) до 100 (100 включно), то "Жовтий", якщо більше 100 (100 виключно) - "Зелений";
 * <p>
 * 5.+ Створіть метод compareNumbers(), у тілі якого оголосіть дві int змінні a і b, та ініціалізуйте їх будь-якими значеннями, якими захочете. Якщо a більше або одно b, необхідно вивести в консоль повідомлення “a >= b”, інакше “a < b”;
 * <p>
 * 6.+ Написати метод, який приймає на вхід два цілих числа і перевіряє, що їхня сума лежить в межах від 10 до 20 (включно), якщо так – повернути true, інакше – false.
 * <p>
 * 7.+ Написати метод, якому як параметр передається ціле число, метод повинен надрукувати в консоль, чи додатнє число передали або від’ємне. Примітка: нуль вважаємо позитивним числом.
 * <p>
 * 8.+ Написати метод, якому як параметр передається ціле число. Метод повинен повернути true, якщо число є негативним, і повернути false якщо позитивне.
 * <p>
 * 9. + Написати метод, якому як аргументи передається рядок і число, метод повинен надрукувати в консоль зазначений рядок, вказану кількість разів;
 * <p>
 * 10. + * Написати метод, який визначає, чи є рік високосним, і повертає boolean (високосний – true, не високосний – false). Кожен 4-й рік є високосним, крім кожного 100-го, причому кожен 400-й – високосний.
 */


public class HomeWorkApp {
    public static String[] fruits = {"Orange", "Banana", "Apple"};

    public static void main(String[] args) {
        printThreeWords();

        checkSumSign(2, 5);
        checkSumSign(-6, 3);

        printColor(-5);
        printColor(5);
        printColor(105);

        compareNumbers(2, 6);
        compareNumbers(8, 4);

        System.out.println(sumNumbers(2, 9));
        System.out.println(sumNumbers(6, 1));

        checkNumberA(-8);

        System.out.println(checkNumberB(-8));

        showMessage("Слава Україні", 10);

        int year = 2024;
        boolean checkYear = checkYear(year);

        System.out.println("Рік " + year + " є високосним? " + checkYear);
    }

    public static void printThreeWords() {
        for (String fruit : fruits)
            System.out.println(fruit);
    }

    public static void checkSumSign(int a, int b) {
        if (a + b >= 0) System.out.println("Сума позитивна");
        if (a + b < 0) System.out.println("Сума негативна");

    }

    public static void printColor(int value) {
        if (value < 0) System.out.println("Червоний");
        if (value >= 0 && value < 100) System.out.println("Жовтий");
        if (value >= 100) System.out.println("Зелений");
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) System.out.println("a >= b");
        if (a < b) System.out.println("a < b");
    }

    public static boolean sumNumbers(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    public static void checkNumberA(int value) {
        if (value > 0) System.out.println("додатнє");
        else System.out.println("від’ємне");
    }

    //негативним, і повернути false якщо позитивне.
    public static boolean checkNumberB(int value) {
        return value >= 0;
    }

    public static void showMessage(String message, int value) {
        for (int i = 0; i < value; i++) System.out.println(message);
    }

    public static boolean checkYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
