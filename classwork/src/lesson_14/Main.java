package lesson_14;

public class Main {

    public static void main(String[] args) {
        String[][] array1 = new String[][]{{"1", "2", "3", "4"}, {"5", "6", "@", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        String[][] array2 = new String[][]{{"1", "2", "3", "4"}, {"5", "6", "A", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        String[][] array3 = new String[][]{{"1", "2", "4"}, {"5", "6", "6", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        String[][] array4 = new String[][]{{"1", "2", "3", "4"}, {"5", "6", "9", "8"}, {"9", "10", "11", "12"},{"9", "10", "11", "12"}, {"13", "14", "15", "16"}};

        checkArr(array1);
        checkArr(array2);
        checkArr(array3);
        checkArr(array4);

    }
    public static void checkArr(String[][] array){
        try {
            System.out.println("Результат підсумку вмисту массива: " + ArrayValueCalculator.doCalc(array));
        } catch (ArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (ArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
