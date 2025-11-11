package Composition_Java.LibraryApp;

import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> books;  // composition (Library has Books)

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showLibraryDetails() {
        System.out.println("=== " + name + " Library ===");
        for (Book book : books) {
            book.showBookDetails();
        }
    }
}
