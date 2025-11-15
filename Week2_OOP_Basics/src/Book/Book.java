package Book;
public class Book {

    private String title;
    private String author;
    private int price;

    //Constructor (Method Override)
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

    //Getters
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPrice() {
        return price;
    }

    //Unique Method
    public String toString(){
        return "Title: " + title + "\nAuthor: " + author + "\nPrice: R" + price + "\n";
    }
}
