package no.bugs.homework3.task10;

public class Electronics extends Product {

    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double applyDiscount() {
        return price > 100 ? price * 0.9 : price;
    }
}
