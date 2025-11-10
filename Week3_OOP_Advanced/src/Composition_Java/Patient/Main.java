package Composition_Java;

public class Main {
    public static void main(String[] args) {

       Address address = new Address(20,"Robert broom drive", "Sugarbush Estate", "Krugersdorp", 1739);
       Patient patient = new Patient(address, "Dr Moalusi");

        patient.showDetails();
    }
}
