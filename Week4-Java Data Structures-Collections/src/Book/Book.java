package Book;

public class Book {

    //Attributes
    private String title;
    private String author;
    private String yearPublished;
    private String category;

    //Constructor
    public Book(String title, String author, String yearPublished, String category){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.category = category;
    }

    //Getters
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getYearPublished() {
        return yearPublished;
    }
    public String getCategory() {
        return category;
    }

    //Unique Methods
    public String toString(){
        return "Title: " + title +
                "\nAuther: " + author +
                "\nPublished year: " + yearPublished +
                "\nCategory: " + category + "\n";
    }
}
