package lesson_02;

/**
 * Програму, яка пропонує користувачеві запровадити суму грошового вкладу у гривнях, відсоток річних, які виплачує банк, тривалість вкладу (років).
 * Вивести накопичену суму грошей за кожен рік та нараховані відсотки. (Відсотки складні з капіталізацією щомісяця)
 * */
public class DepositCalculate {
    public static void main(String[] args) {
        double many = Double.valueOf(args[0]);
        double interestRate = Double.valueOf(args[1]);
        int years = Integer.valueOf(args[2]);

        System.out.println("суму вкладу: " + many + " гривень");

        System.out.println("процентна ставка: " + interestRate + " %");

        System.out.println("тривалість вкладу на: " + years + " років");


        // Розраховуємо суму грошей, що накопичилася.
        double manyCalculation = many;
        for (int i = 1; i <= years; i++) {
            manyCalculation += manyCalculation * interestRate / 100;
        }

        // Розраховуємо нараховані відсотки
        double profit = manyCalculation - many;

        // Выводим результаты
        System.out.println("Сума грошей, що накопичилася через " + years + " років: " + manyCalculation);
        System.out.println("Нараховані відсотки: " + profit);
    }
}
