package no.bugs.homework3.task3;

// Задача 3: Класс для представления единицы товара
public class Item {
    String name;
    double price;
    int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    int sell(int amount) {
        if (quantity >= amount) {
            quantity -= amount;
        } else {
            System.out.println("Недостаточно товара на складе");
        }
        return quantity;
    }

    double restock(int amount) {
        quantity = quantity + amount;
        return quantity;
    }


    public String getInfo() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }


    public static void main(String[] args) {
        Item item = new Item();
        item.setName("Абрикос");
        item.setPrice(10.0);
        item.setQuantity(7);
        System.out.println("Информация о товаре: " + item.getInfo());
        System.out.println("Осталось на складе после продажи: " + item.sell(6));
        System.out.println("Количество товара после возврата: " + item.restock(10));

    }

}
