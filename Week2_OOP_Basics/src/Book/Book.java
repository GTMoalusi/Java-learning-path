package Book;
public class Book {

    String title;
    String author;
    int price;

    //Constructor
    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    Book(String title, String author){
        this.title = title;
        this.author = author;
        this.price = 0;
    }
    Book(String title){
        this.title = title;
        this.author = "Unknown Author";
        this.price = 0;
    }

    public String toString(){
        return "Title: " + title + "\nAuthor: " + author + "\nPrice: R" + price + "\n";
    }
}
