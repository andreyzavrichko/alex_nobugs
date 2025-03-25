package no.bugs.homework3.task10;

import java.util.HashMap;
import java.util.Map;

public class OrderDatabase implements DatabaseOperations {
    private final Map<Integer, Order> orderMap = new HashMap<>();


    @Override
    public void saveOrder(Order order) {
        orderMap.put(order.getOrderId(), order);
        System.out.println("Заказ " + order.getOrderId() + " сохранен в базе данных.");
    }

    @Override
    public Order getOrder(int orderId) {
        return orderMap.get(orderId);
    }
}
