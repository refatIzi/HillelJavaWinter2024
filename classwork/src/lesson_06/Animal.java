package lesson_06;

public abstract class Animal {
    private static int totalCount = 0;
    public Animal() {
        totalCount++;
    }
    public static int getTotalCount() {
        return totalCount;
    }

    public abstract void run(int length);

    public abstract void swim(int length);
}