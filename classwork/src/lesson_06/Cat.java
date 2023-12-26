package lesson_06;


public class Cat extends Animal {

    String name;
    static int count=0;
    public Cat(String name) {
        this.name = name;
        count ++;
    }

    @Override
    public void run(int length) {
        if (length <= 200) {
            System.out.println(this.name + " run " + length + " m");
        } else {
            System.out.println("The cat can not run more than 200 m");
        }
    }
    @Override
    public void swim(int length) {
        System.out.println(this.name + " Can not swim");
    }
}
