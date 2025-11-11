package Composition_Java.LibraryApp;

public class Author {
    //Attributes
    private String name;
    private String nationality;

    //Constructor
    public Author(String name, String nationality){
        this.name = name;
        this.nationality = nationality;
    }

    //Getters & Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString(){
        return name + " (" + nationality + ")";
    }
}
