package no.bugs.homework6.task5;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Книга 1");
        library.addBook("Книга 2");
        library.addBook("Книга 3");

        library.openBook("Книга 3");
        library.goToPage(8);
        library.showCurrentPage();


    }
}
