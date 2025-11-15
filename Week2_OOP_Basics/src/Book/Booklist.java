package Book;

import java.util.ArrayList;

public class Booklist {
    public static void main(String[] args) {
        Book book1 = new Book("The Monk Who Sold His Ferari", "Gideon", 650);
        Book book2 = new Book("The Richest Man in Babylon", "Thabang");
        Book book3 = new Book("7 Habits of Highly Successful People");

        ArrayList<Book> listOfBooks = new ArrayList<>();

        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);

        for(Book book : listOfBooks){
            System.out.println(book.toString());
        }

        System.out.println("Number of books in the array: " + listOfBooks.size());
        System.out.println();
        System.out.println("===========================");

        listOfBooks.remove(book3);

        for(Book book : listOfBooks){
            System.out.println(book.toString());
        }

        System.out.println("Number of books in the array: " + listOfBooks.size());
        System.out.println();
        System.out.println("===========================");
        System.out.println();

        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Price: R" + book3.getPrice());
    }
}
