package no.bugs.homework3.task10;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Аркадий Укупник", "arc@test.com");
        Admin admin = new Admin(2, "Администратор", "admin@test.com");

        Electronics laptop = new Electronics(101, "Макбук", 2400);
        Clothing tShirt = new Clothing(102, "Футболка", 120);

        customer.addToCart(laptop);
        customer.addToCart(tShirt);

        List<Product> products = customer.getCart();
        Order order = new Order(1, customer, products, 4000);

        System.out.println("Общая стоимость заказа: " + order.getTotalPrice());

        OrderDatabase database = new OrderDatabase();
        database.saveOrder(order);
    }
}
