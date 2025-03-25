package no.bugs.homework3.task10;

import java.util.List;

public class Order {
    private int orderId;
    private Customer customer;
    private List<Product> productList;
    private double totalPrice;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Order(int orderId, Customer customer, List<Product> productList, double totalPrice) {
        this.orderId = orderId;
        this.customer = customer;
        this.productList = productList;
        this.totalPrice = totalPrice;
    }

    private double calculateTotalPrice() {
        double sum = 0;
        for (Product product : productList) {
            sum += product.applyDiscount();
        }
        return sum;
    }

}
