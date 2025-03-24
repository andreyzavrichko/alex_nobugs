package no.bugs.homework3.task1;

// Задача 1: Класс для представления прямоугольника
public class Rectangle {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    static double calculateArea(double width, double height) {
        return width * height;
    }

    static double calculatePerimeter(double width, double height) {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(4.00);
        rectangle.setHeight(5.00);

        System.out.println("Площадь прямоугольника равна : " + calculateArea(rectangle.getWidth(), rectangle.getHeight()));
        System.out.println("Периметр прямоугольника равна : " + calculatePerimeter(rectangle.getWidth(), rectangle.getHeight()));

    }

}
