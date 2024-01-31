package lesson_13.coffe;
import lesson_13.coffe.order.CoffeeOrderBoard;

public class Main {

    public static void main(String[] args) {
        CoffeeOrderBoardTest test = new CoffeeOrderBoardTest();
        test.testAddOrder();
        //test.testDrawOrders();
        test.testDeliverFirstOrder();
        test.testDeliverSpecificOrder();
    }
}