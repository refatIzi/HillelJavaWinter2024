package lesson_06;

public class Dog extends Animal {

    String name;
    static int count=0;
    public Dog(String name) {
        this.name = name;
        count++;
    }
    @Override
    public void run(int length) {
        if (length <= 500) {
            System.out.println(this.name + " run " + length + " m");
        } else {
            System.out.println(this.name + " can run up to 500 m");
        }
    }
    @Override
    public void swim(int length) {
        if (length <= 10) {
            System.out.println(this.name + " swim " + length + " m");
        } else {
            System.out.println(this.name + " can swim up to 10 m");
        }
    }
}
