package Car2;

public class Main {
    public static void main(String[] args) {
        //Objects
        Car car = new Car("RS7", "Audi", "Metallic Black", 4, 0, 2025);
        Bicycle bicycle = new Bicycle("Mountain Bike", "BMX", "Red", 0,0,2,2018);
        Truck truck = new Truck("P-Series", "Scania AB", "Blue", 2, 0, 2025, 16, true);

        System.out.println("===== Car Details =====");
        System.out.println(car);
        car.startEngine();
        car.accelerate(230);
        car.goStraight();
        car.brake(200);
        car.goStraight();
        car.turnRight();
        car.accelerate(240);
        car.goStraight();
        car.brake(260);
        car.turnLeft();
        car.brake(40);
        car.goInReverse();
        car.stopEngine();
        System.out.println();
        System.out.println();

        System.out.println("===== Bicycle Details =====");
        System.out.println(bicycle);
        System.out.println();
        System.out.println();

        System.out.println("===== Truck Details =====");
        System.out.println(truck);



    }
}
