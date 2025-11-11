package Composition_Java.LibraryApp;

public class Main {
    public static void main(String[] args) {

        // Create Authors
        Author author1 = new Author("George Orwell", "British");
        Author author2 = new Author("Aldous Huxley", "British");
        Author author3 = new Author("Chinua Achebe", "Nigerian");

        // Create Books
        Book book1 = new Book("1984", "Dystopian", 1949);
        book1.addAuthor(author1);

        Book book2 = new Book("Brave New World", "Science Fiction", 1932);
        book2.addAuthor(author2);

        Book book3 = new Book("Things Fall Apart", "Historical Fiction", 1958);
        book3.addAuthor(author3);

        // Create Library
        Library library = new Library("Krugersdorp Central");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display Library info
        library.showLibraryDetails();
    }
}
