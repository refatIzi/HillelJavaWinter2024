package lesson_13.coffe;

import lesson_13.coffe.order.CoffeeOrderBoard;

public class Coffe {
    public static void main(String[] args) {

        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        coffeeOrderBoard.add("Artem");
        coffeeOrderBoard.add("Yoda");
        coffeeOrderBoard.add("Obi-van");
        coffeeOrderBoard.add("John Snow");
        coffeeOrderBoard.draw();
        System.out.println("############################");
        coffeeOrderBoard.deliver(1);
        coffeeOrderBoard.deliver(4);
        System.out.println("############################");
        coffeeOrderBoard.draw();
        coffeeOrderBoard.deliver();
        System.out.println("############################");
        coffeeOrderBoard.draw();
    }
}
