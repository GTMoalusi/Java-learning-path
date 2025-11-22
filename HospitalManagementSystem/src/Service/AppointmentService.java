package Service;

import Model.Appointment;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class AppointmentService {

    // Stores appointments by ID
    private Map<String, Appointment> appointmentsById = new HashMap<>();

    // Keeps order of scheduled appointments
    private List<Appointment> appointmentList = new ArrayList<>();

    // Prevent double booking
    private Set<String> doctorTimeSlots = new HashSet<>();
    private Set<String> patientTimeSlots = new HashSet<>();


    // Generate unique key based on doctor & time
    private String doctorKey(String doctorId, LocalDate date, LocalTime time) {
        return doctorId + "|" + date + "|" + time;
    }

    // Generate unique key for patient
    private String patientKey(String patientId, LocalDate date, LocalTime time) {
        return patientId + "|" + date + "|" + time;
    }

    // ------------------------- 1. Schedule Appointment -------------------------
    public void scheduleAppointment(Appointment appointment) {

        String docKey = doctorKey(
                appointment.getDoctor().getDoctorId(),
                appointment.getDate(),
                appointment.getTime()
        );

        String patKey = patientKey(
                appointment.getPatient().getPatientId(),
                appointment.getDate(),
                appointment.getTime()
        );

        // • CHECK double booking for doctor
        if (doctorTimeSlots.contains(docKey)) {
            System.out.println("❌ Doctor is already booked at this time!");
            return;
        }

        // • CHECK double booking for patient
        if (patientTimeSlots.contains(patKey)) {
            System.out.println("❌ Patient already has an appointment at this time!");
            return;
        }

        // Add to collections
        appointmentsById.put(appointment.getAppointmentId(), appointment);
        appointmentList.add(appointment);

        // Mark as booked
        doctorTimeSlots.add(docKey);
        patientTimeSlots.add(patKey);

        System.out.println("✅ Appointment scheduled successfully.");
    }

    // ------------------------- 2. Cancel Appointment -------------------------
    public void cancelAppointment(String appointmentId) {

        Appointment appt = appointmentsById.remove(appointmentId);

        if (appt == null) {
            System.out.println("❌ Appointment not found.");
            return;
        }

        appointmentList.remove(appt);

        // Clear availability slots
        String docKey = doctorKey(appt.getDoctor().getDoctorId(), appt.getDate(), appt.getTime());
        String patKey = patientKey(appt.getPatient().getPatientId(), appt.getDate(), appt.getTime());

        doctorTimeSlots.remove(docKey);
        patientTimeSlots.remove(patKey);

        System.out.println("🗑 Appointment cancelled successfully.");
    }

    // ------------------------- 3. Reschedule Appointment -------------------------
    public void rescheduleAppointment(String appointmentId, LocalDate newDate, LocalTime newTime) {

        Appointment appt = appointmentsById.get(appointmentId);

        if (appt == null) {
            System.out.println("❌ Appointment not found.");
            return;
        }

        // Create keys for OLD slot
        String oldDocKey = doctorKey(appt.getDoctor().getDoctorId(), appt.getDate(), appt.getTime());
        String oldPatKey = patientKey(appt.getPatient().getPatientId(), appt.getDate(), appt.getTime());

        // Create keys for NEW slot
        String newDocKey = doctorKey(appt.getDoctor().getDoctorId(), newDate, newTime);
        String newPatKey = patientKey(appt.getPatient().getPatientId(), newDate, newTime);

        // Check new availability
        if (doctorTimeSlots.contains(newDocKey)) {
            System.out.println("❌ Doctor is already booked at the new time!");
            return;
        }

        if (patientTimeSlots.contains(newPatKey)) {
            System.out.println("❌ Patient has another appointment at the new time!");
            return;
        }

        // Free old slot
        doctorTimeSlots.remove(oldDocKey);
        patientTimeSlots.remove(oldPatKey);

        // Update the appointment
        appt.setDate(newDate);
        appt.setTime(newTime);

        // Reserve new slot
        doctorTimeSlots.add(newDocKey);
        patientTimeSlots.add(newPatKey);

        System.out.println("🔄 Appointment rescheduled successfully.");
    }

    // ------------------------- 4. View Doctor Schedule -------------------------
    public void viewDoctorSchedule(String doctorId) {
        System.out.println("\n📅 Schedule for Doctor ID: " + doctorId);

        for (Appointment a : appointmentList) {
            if (a.getDoctor().getDoctorId().equals(doctorId)) {
                a.viewDetails();
                System.out.println("----------------------------");
            }
        }
    }

    // ------------------------- 5. View Patient Appointments -------------------------
    public void viewPatientAppointments(String patientId) {
        System.out.println("\n📋 Appointments for Patient ID: " + patientId);

        for (Appointment a : appointmentList) {
            if (a.getPatient().getPatientId().equals(patientId)) {
                a.viewDetails();
                System.out.println("----------------------------");
            }
        }
    }

    // ------------------------- 6. List All Appointments -------------------------
    public void listAllAppointments() {
        if (appointmentList.isEmpty()) {
            System.out.println("📭 No appointments scheduled.");
            return;
        }

        System.out.println("\n📋 All Scheduled Appointments:");
        System.out.println("================================");

        for (Appointment appt : appointmentList) {
            appt.viewDetails();
            System.out.println("----------------------------");
        }

        System.out.println("Total: " + appointmentList.size() + " appointments");
    }

    // ------------------------- 7. Get Total Appointments -------------------------
    public int getTotalAppointments() {
        return appointmentList.size();
    }

    // ------------------------- 8. View Appointments By Date -------------------------
    public void viewAppointmentsByDate(LocalDate date) {
        System.out.println("\n📅 Appointments on " + date);

        boolean found = false;
        for (Appointment a : appointmentList) {
            if (a.getDate().equals(date)) {
                a.viewDetails();
                System.out.println("----------------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No appointments on this date.");
        }
    }

    // ------------------------- 9. Get Available Time Slots -------------------------
    public void showAvailableSlots(String doctorId, LocalDate date) {
        System.out.println("\n🕐 Available slots for Doctor " + doctorId + " on " + date);

        // Standard working hours: 9 AM to 5 PM
        for (int hour = 9; hour <= 17; hour++) {
            LocalTime time = LocalTime.of(hour, 0);
            String key = doctorKey(doctorId, date, time);

            if (!doctorTimeSlots.contains(key)) {
                System.out.println("✓ " + time + " - Available");
            } else {
                System.out.println("✗ " + time + " - Booked");
            }
        }
    }

    // ------------------------- 10. Sort Appointments By Date/Time -------------------------
    public void viewAllAppointmentsSorted() {
        if (appointmentList.isEmpty()) {
            System.out.println("No appointments.");
            return;
        }

        List<Appointment> sorted = new ArrayList<>(appointmentList);
        sorted.sort((a1, a2) -> {
            int dateComp = a1.getDate().compareTo(a2.getDate());
            if (dateComp != 0) {
                return dateComp;
            };
            return a1.getTime().compareTo(a2.getTime());
        });

        System.out.println("\n📋 All Appointments (Sorted by Date & Time):");
        for (Appointment a : sorted) {
            a.viewDetails();
            System.out.println("---");
        }
    }
}