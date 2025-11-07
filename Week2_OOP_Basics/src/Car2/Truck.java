package Car2;

public class Truck extends Vehicle{

    //Attributes
    private int loadSize;
    private boolean hasTrailer;

    //Constructor
    public Truck(String model, String make, String color, int doors, int currentSpeed, int yearProduced,
                 int loadSize, boolean hasTrailer){
        super(model, make, color, doors, currentSpeed, yearProduced);
        this.loadSize = loadSize;
        this.hasTrailer = hasTrailer;
    }

    //Unique Methods
    @Override
    public String toString() {
        return super.toString() +
                "\nVehicle load size is: " + loadSize + " kg" +
                "\nVehicle has a trailer? " + hasTrailer;
    }

    //Getters & Setters
    public boolean isHasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    public int getLoadSize() {
        return loadSize;
    }

    public void setLoadSize(int loadSize) {
        this.loadSize = loadSize;
    }
}
