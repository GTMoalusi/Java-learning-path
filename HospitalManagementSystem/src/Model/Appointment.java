package Model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {
    //Attributes
    private String appointmentId;
    private LocalDate date;
    private LocalTime time;
    private Doctor doctor; //Composition
    private Patient patient; //Composition
    private String reason;

    //Constructor
    public Appointment(String appointmentId, LocalDate date, LocalTime time, Doctor doctor, Patient patient, String reason){
        this.appointmentId = appointmentId;
        this.date = date;
        this.time = time;
        this.doctor = doctor;
        this.patient = patient;
        this.reason = reason;
    }

    //Getters & Setters
    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    //Unique Methods
    public void viewDetails() {
        System.out.println("Appointment ID: " + appointmentId);
        System.out.println("Date: " + date + " Time: " + time);
        System.out.println("Doctor: " + doctor.getName());
        System.out.println("Patient: " + patient.getName());
        System.out.println("Reason: " + reason);
    }

    public void schedule(){

    }

    public void cancel(){

    }

    public void reschedule(){

    }
}
