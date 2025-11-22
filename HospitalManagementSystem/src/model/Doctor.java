package model;

import controller.Schedulable;

public class Doctor extends Person implements Schedulable {

    //Attributes
    private String doctorId;
    private String specialization;
    private String department;

    //Constructor
    public Doctor(String name, String gender, int age, String race, String doctorId, String specialization, String department) {
        super(name, gender, age, race);
        this.doctorId = doctorId;
        this.specialization = specialization;
        this.department = department;
    }

    //Getters
    public String getDoctorId() {
        return doctorId;
    }
    public String getSpecialization() {
        return specialization;
    }
    public String getDepartment() {
        return department;
    }

    //Unique Methods
    @Override
    public void displayInfo() {
        System.out.println("Doctor Details:");
        System.out.println("Name: " + getName());
        System.out.println("Specialization: " + specialization);
        System.out.println("Department: " + department);
    }

    @Override
    public void scheduleAppointment() {
        System.out.println("The doctors schedule is empty today");
    }
}
