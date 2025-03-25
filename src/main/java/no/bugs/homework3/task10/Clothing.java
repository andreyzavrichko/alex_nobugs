package no.bugs.homework3.task10;

public class Clothing extends Product {
    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double applyDiscount() {
        return price > 50 ? price * 0.85 : price;
    }
}
