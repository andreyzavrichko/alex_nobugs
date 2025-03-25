package no.bugs.homework3.task10;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    private List<Product> cart;


    public Customer(int id, String name, String email) {
        super(id, name, email);
        this.cart = new ArrayList<>();
    }

    public void addToCart(Product product) {
        cart.add(product);
        System.out.println(product.getName() + " добавлен в корзину.");
    }

    public List<Product> getCart() {
        return cart;
    }
}
