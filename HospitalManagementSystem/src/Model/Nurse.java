package Model;

import Interface.Schedulable;

public class Nurse extends Person implements Schedulable {
    //Attributes
    private String nurseId;
    private String specialization;
    private String department;

    //Constructor
    public Nurse(String name, String gender, int age, String race, String nurseId, String specialization, String department){
        super(name, gender, age, race);
        this.nurseId = nurseId;
        this.specialization = specialization;
        this.department = department;
    }

    //Getters
    public String getNurseId() {
        return nurseId;
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
        System.out.println("Nurse Details:");
        System.out.println("Name: " + getName());
        System.out.println("Specialization: " + specialization);
        System.out.println("Department: " + department);
    }

    @Override
    public void scheduleAppointment() {
        System.out.println("The nurse is off today");
    }
}
