package lesson_03;

import my_decisions.MyScanner;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner(System.in);

        new MathOperations().PrintUnpairedMethOne();
        new MathOperations().PrintUnpairedMethTwo();
        new MathOperations().PrintUnpairedMethThree();

        System.out.println("Введіть число n: ");
        int n = scanner.nextInt();
        System.out.println("Factorial method one: " + new MathOperations().factorialOne(n));
        System.out.println("Factorial method two: " + new MathOperations().factorialTwo(n));
        System.out.println("Factorial method three: " + new MathOperations().factorialThree(n));

        System.out.println("Обчислення x^a: ");
        System.out.println("Введіть число x: ");
        int x = scanner.nextInt();
        System.out.println("Введіть число a: ");
        int a = scanner.nextInt();
        System.out.println("x^a =: " + new MathOperations().degree(x,a));
        System.out.println("Вивести 10 перших чисел послідовності 0, -5,-10,-15.");
        new MathOperations().printTenNumInSequence();


        System.out.println("Таблиця множення. Виведіть число яку треба вивести на екран: ");
        int b = scanner.nextInt();
        new MathOperations().multiplication(b);

        new MathOperations().printArrayFirstTenNumbers();

        System.out.println("Введіть розмір масиву: ");

        int s = scanner.nextInt();
        new MathOperations().arrayMinimumElement(s);
        new MathOperations().arrayMaxElement(s);
        new MathOperations().changeArrayMaxMinElements(s);
    }
}
