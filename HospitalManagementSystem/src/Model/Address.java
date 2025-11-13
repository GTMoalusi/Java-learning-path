package Model;

public class Address {
    //Attributes
    private String houseNumber;
    private String street;
    private String city;
    private String province;
    private String postalCode;

    //Constructor
    public Address(String houseNumber, String street, String city, String province, String postalCode){
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }

    //Getters & Setters
    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    //Unique Methods
    @Override
    public String toString() {
        return houseNumber + " " + street + ", " + city + ", " + province + ", " + postalCode;
    }
}
