package no.bugs.homework4.structure;

// Задача 2: Строки (Strings)
public class Strings {
    public static void main(String[] args) {
        String value = "Привет";
        System.out.println(reverse(value));
    }

    static StringBuilder reverse(String value) {
        return new StringBuilder(value).reverse();
    }
}
