package no.bugs.homework6.task5;

public class Book {
    private final String name;
    private int currentPage;

    public Book(String name) {
        this.name = name;
        this.currentPage = 1;
    }


    public String getName() {
        return name;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int page) {
        if (page > 0) {
            this.currentPage = page;
        }
    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", currentPage=" + currentPage +
                '}';
    }
}
