package lesson_14;

public class ArrayValueCalculator {
    public static int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        int sum = 0;

        if (array.length != 4) {
            throw new ArraySizeException("Невірний масиву. Очікується тільки 4x4, а в вас " + array.length + "x" + array[0].length);
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    int value = Integer.parseInt(array[i][j]);
                    sum += value;
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Знайдено невірний символ в комірці перевірте введені данні [" + i + "][" + j + "] = "+array[i][j] , e);
                }
            }
        }

        return sum;
    }
}

