package no.bugs.homework3.task10;

// Задача 10: Система управления заказами в интернет-магазине
public class Admin extends User {


    public Admin(int id, String name, String email) {
        super(id, name, email);
    }

    public void changeProductPrice(Product product, double newPrice) {
        product.setPrice(newPrice);
        System.out.println("Цена товара " + product.getName() + " изменена на " + newPrice);
    }
}
