package Model;

public class Doctor extends Person{

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

    //Getters & Setters
    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    //Unique Methods
    @Override
    public void displayInfo() {
        System.out.println("Doctor Details:");
        System.out.println("Name: " + getName());
        System.out.println("Specialization: " + specialization);
        System.out.println("Department: " + department);
    }

    public void viewPatients(){

    }

    public void diagnose(){

    }

    public void prescribe(){

    }

    public void addNotes(){

    }
}
