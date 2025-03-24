package no.bugs.homework3.task9;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Маленький принц", "Антуан де Сент-Экзюпери", 1943, true);
        System.out.println(book.getBookInfo());
        book.borrowBook();
        book.returnBook();

    }


}
