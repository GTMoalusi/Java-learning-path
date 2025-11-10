package Book;

public class Booklist {
    public static void main(String[] args) {
        Book book1 = new Book("The Monk Who Sold His Ferari", "Gideon", 650);
        Book book2 = new Book("The Richest Man in Babylon", "Thabang");
        Book book3 = new Book("7 Habits of Highly Successful People");

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
