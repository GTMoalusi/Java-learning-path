package Composition_Java.LibraryApp;

import java.util.ArrayList;

public class Book {

    //Attributes
    private String title;
    private String genre;
    private int year;
    private ArrayList<Author> authors;

    //Constructor
    public Book(String title, String genre, int year){
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.authors = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void showBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Year: " + year);
        System.out.println("Authors:");

        for (Author a : authors) {
            System.out.println("  - " + a);
        }
        System.out.println();
    }
}
