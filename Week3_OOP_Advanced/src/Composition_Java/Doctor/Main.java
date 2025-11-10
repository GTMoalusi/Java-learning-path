package Composition_Java.Doctor;

public class Main {
    public static void main(String[] args) {

        //Objects
        Department department = new Department("Process Design & Coding");
        Doctor doctor = new Doctor(department, "Dr Moalusi");

        System.out.println(doctor);
    }
}
