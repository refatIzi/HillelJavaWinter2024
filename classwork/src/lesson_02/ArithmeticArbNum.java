package lesson_02;

/**
 * Програма, яка знаходить середнє арифметичне значення довільної кількості чисел.
 * */
public class ArithmeticArbNum {
    public static void main(String[] args) {
        double sum = 0;
        for (String arg : args) {
            sum += Double.valueOf(arg);
            System.out.println(arg);

        }
        System.out.println("Кількість елементів:"+args.length);
        System.out.println("Сумма елементів: "+sum);
        System.out.println("Середне арифметичне: "+sum/ args.length);
    }
}
