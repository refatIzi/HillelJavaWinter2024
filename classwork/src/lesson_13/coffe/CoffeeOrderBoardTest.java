package lesson_13.coffe;

import lesson_13.coffe.order.CoffeeOrderBoard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeOrderBoardTest {

    @Test
    public void testAddOrder() {
        CoffeeOrderBoard board = new CoffeeOrderBoard();
        board.add("Cappuccino");
        board.add("Latte");

        assertEquals(2, board.orders.size());
        assertEquals("Cappuccino", board.orders.get(0).getName());
        assertEquals("Latte", board.orders.get(1).getName());
    }

    @Test
    public void testDeliverFirstOrder() {
        CoffeeOrderBoard board = new CoffeeOrderBoard();
        board.add("Americano");
        board.add("Espresso");

        board.deliver();

        assertEquals(1, board.orders.size());
        assertEquals("Espresso", board.orders.get(0).getName());
    }

    @Test
    public void testDeliverSpecificOrder() {
        CoffeeOrderBoard board = new CoffeeOrderBoard();
        board.add("Mocha");
        board.add("Frappuccino");
        board.add("Macchiato");

        board.deliver(2);

        assertEquals(2, board.orders.size());
        assertEquals("Mocha", board.orders.get(0).getName());
        assertEquals("Frappuccino", board.orders.get(1).getName());
    }

    @Test
    public void testDrawOrders() {
        CoffeeOrderBoard board = new CoffeeOrderBoard();
        board.add("Americano");
        board.add("Latte");

        String expectedOutput = "Num  |  Name\n" +
                "1    |  Americano\n" +
                "2    |  Latte\n";

        assertEquals(expectedOutput, board.draw());
    }
}
