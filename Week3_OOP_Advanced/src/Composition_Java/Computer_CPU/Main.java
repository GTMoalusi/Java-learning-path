package Composition_Java.Computer_CPU;

public class Main {
    public static void main(String[] args) {
        CPU intel = new CPU("Intel Core i5");
        CPU amd = new CPU("AMD Ryzen 9");

        Computer myFirstPC = new Computer(intel);
        Computer mySecondPC = new Computer(amd);

        myFirstPC.startComputer();
        System.out.println("--------------------");
        mySecondPC.startComputer();
    }
}
