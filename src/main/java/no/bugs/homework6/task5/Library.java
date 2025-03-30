package no.bugs.homework6.task5;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private final Map<String, Book> books = new HashMap<>();
    private Book activeBook;


    public void addBook(String name) {
        books.put(name, new Book(name));
    }

    public void openBook(String name) {
        if (books.containsKey(name)) {
            activeBook = books.get(name);
            System.out.println("Открыли книгу " + name);
        } else {
            System.out.println("Данная книга не была найдена " + name);
        }
    }

    public void showCurrentPage() {
        if (activeBook != null) {
            System.out.println("Текущая книга " + activeBook);
        } else {
            System.out.println("Данная книга не была найдена ");
        }
    }

    public void goToPage(int page) {
        if (activeBook != null) {
            activeBook.setCurrentPage(page);
            System.out.println("Книга открыта на странице " + page);
        } else {
            System.out.println("Данная книга не была найдена ");
        }
    }


}
