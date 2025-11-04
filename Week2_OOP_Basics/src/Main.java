public class Main {
    public static void main(String[] args) {
        //Objects
        Car myFirstCar = new Car("Audi","RS7","Metallic Red",2025);
        Car mySecondCar = new Car("BMW","M4-Competition","Black",2024);
        Car myThirdCar = new Car("Volkswagen","Golf 8.5-R","Black",2025);

        //Necessary if you want to use the toString() method to display details.
//       System.out.println(myFirstCar.toString());
//       System.out.println();
//        System.out.println(mySecondCar.toString());
//       System.out.println();
//       System.out.println(myThirdCar.toString());

        //Interact with the car

        //First Car
        myFirstCar.displayInfo();
        myFirstCar.startEngine();
        myFirstCar.accelerate(300);
        myFirstCar.brake(68);
        myFirstCar.displayInfo();
        myFirstCar.stopEngine();

        System.out.println();
        System.out.println();

        //Second Car
        mySecondCar.displayInfo();
        mySecondCar.startEngine();
        mySecondCar.accelerate(289);
        mySecondCar.brake(56);
        mySecondCar.displayInfo();
        mySecondCar.stopEngine();

        System.out.println();
        System.out.println();

        //Third Car
        myThirdCar.displayInfo();
        myThirdCar.startEngine();
        myThirdCar.accelerate(267);
        myThirdCar.brake(32);
        myThirdCar.displayInfo();
        myThirdCar.stopEngine();

        System.out.println();
        System.out.println();

    }
}