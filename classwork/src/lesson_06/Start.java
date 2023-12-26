package lesson_06;

import static lesson_06.Animal.getTotalCount;

public class Start {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Bobik");
        dog1.run(455);
        dog1.swim(10);

        Cat cat1 = new Cat("Murka");
        cat1.run(270);
        cat1.swim( 10);


        System.out.println("Number of dogs created:" + Dog.count);
        System.out.println("Number of cats created:" + Cat.count);
        System.out.println("Number of animals created:" + getTotalCount());
    }
}
