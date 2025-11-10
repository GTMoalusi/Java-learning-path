package Composition_Java;

public class Address {
    //Attributes
    private int houseNumber;
    private String streetName;
    private String suburb;
    private String area;
    private int postalCode;

    //Constructor
    public Address(int houseNumber, String streetName, String suburb, String area, int postalCode){
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.suburb = suburb;
        this.area = area;
        this.postalCode = postalCode;
    }

    //Unique Method
    @Override
    public String toString(){
        return "\nHouse number: " + houseNumber +
                "\nStreet name: " + streetName +
                "\nSuburb name: " + suburb +
                "\nArea name: " + area +
                "\nPostal code: " + postalCode;
    }
}
