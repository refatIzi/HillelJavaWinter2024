package lesson_13.coffe.order;


import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {

    private List<Order> orders = new ArrayList<>();

    public void add(String name) {
        orders.add(new Order(Order.current, name));
        Order.current++;
    }

    public void deliver() {
        orders.remove(0);
    }

    public void deliver(int index) {
        for (int i = 0; i < orders.size(); i++)
            if (orders.get(i).getOrder() == index)
                orders.remove(orders.get(i));
    }

    public void draw() {
        System.out.println("Num  |  Name");
        for (int i = 0; i < orders.size(); i++)
            System.out.println(orders.get(i).getOrder() + "  |  " + orders.get(i).getName());

    }
}