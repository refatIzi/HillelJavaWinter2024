package lesson_03;

import java.util.Arrays;
import java.util.Random;

public class MathOperations {
    public void PrintUnpairedMethOne() {
        System.out.println("Print Unpaired number Meth One");
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) System.out.println(i);
        }
    }

    public void PrintUnpairedMethTwo() {
        System.out.println("Print Unpaired number Meth Two");
        int i = 1;
        while (i <= 99) {
            System.out.println(i);
            i += 2;
        }
    }

    public void PrintUnpairedMethThree() {
        System.out.println("Print Unpaired number Meth Three");
        int i = 1;
        do {
            System.out.println(i);
            i += 2;
        } while (i <= 99);
    }

    public int factorialOne(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public int factorialTwo(int n) {
        int factorial = 1;
        int i = 1;
        while (i <= n) {
            factorial *= i;
            i++;
        }
        return factorial;
    }

    public int factorialThree(int n) {
        int factorial = 1;
        int i = 1;
        do {
            factorial *= i;
            i++;
        } while (i <= n);
        return factorial;
    }

    public long degree(int x, int a) {
        long result = 1;
        for (int i = 1; i <= a; i++) {
            result *= x;
        }
        return result;
    }

    public void printTenNumInSequence() {
        for (int i = 0; i < 10; i++)
            System.out.print(i * -5 + " ");
        System.out.println();
    }

    public void multiplication(int x) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " * " + i + " = " + x * i);
        }
    }

    public void printArrayFirstTenNumbers() {
        int[] oddNumbers = new int[10];
        oddNumbers[0] = 1;
        for (int i = 1; i < oddNumbers.length; i++)
            oddNumbers[i] = oddNumbers[i - 1] + 2;
        System.out.println(Arrays.toString(oddNumbers));
    }

    public void arrayMinimumElement(int n) {
        int[] array = new int[n];
        array = randomArray(array.length);
        int minElement = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }
        System.out.println("Найменший елемент масиву: " + minElement);
    }

    public void arrayMaxElement(int n) {
        int[] array = new int[n];
        array = randomArray(array.length);
        int maxElement = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }
        System.out.println("Найбільший елемент масиву: " + maxElement);
    }

    public void changeArrayMaxMinElements(int n) {
        int[] array = new int[n];
        array = randomArray(array.length);
        int maxElement = 0;
        int minElement = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxElement]) {
                maxElement = i;
            }
            if (array[i] < array[minElement]) {
                minElement = i;
            }
        }

        int temp = array[maxElement];
        System.out.println("Найменший елемент масиву: " + array[minElement]);
        array[maxElement] = array[minElement];
        array[minElement] = temp;
        System.out.println("Найбільший елемент масиву: " + temp);
        System.out.println("Новий масив: " + Arrays.toString(array));
    }

    private int[] randomArray(int arraySize) {
        int[] array = new int[arraySize];
        // Ініціалізуємо об'єкт класу Random
        Random random = new Random();
        System.out.print("Початковий масив: ");
        for (int i = 0; i < array.length; i++) {
            // Генеруємо випадкове число від -100 до 100
            int randomNumber = random.nextInt(201) - 100;
            array[i] = randomNumber;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        return array;
    }
}
