package main;

import model.*;
import service.*;
import util.HospitalUtil;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("====== HOSPITAL SYSTEM TEST START ======\n");

        // -------------------- 1️⃣ Hospital Setup --------------------
        ContactInfo hospitalContact = new ContactInfo("(011)-2100-342", "customer.service@moalusi.medi.com");
        Hospital hospital = new Hospital("Moalusi Private Hospital",
                "14th Avenue, Sandton City, Johannesburg",
                hospitalContact);
        hospital.displayHospitalInfo();

        // -------------------- 2️⃣ Service Setup --------------------
        PatientService patientService = new PatientService();
        DoctorService doctorService = new DoctorService(patientService);
        NurseService nurseService = new NurseService(patientService);
        AppointmentService appointmentService = new AppointmentService();

        // -------------------- 3️⃣ Create Doctors --------------------
        Doctor doctor1 = new Doctor("Dr. Smith", "Male", 45, "White", "D001", "Cardiologist", "Cardiology");
        Doctor doctor2 = new Doctor("Dr. Adams", "Female", 38, "Black", "D002", "Dermatologist", "Dermatology");
        List<Doctor> doctorList = Arrays.asList(doctor1, doctor2);

        // -------------------- 4️⃣ Create Nurses --------------------
        Nurse nurse1 = new Nurse("Nurse Jane", "Female", 35, "Black", "N001", "ICU", "Intensive Care");
        Nurse nurse2 = new Nurse("Nurse Mike", "Male", 40, "White", "N002", "General", "Ward");

        // -------------------- 5️⃣ Register Patients --------------------
        Address addr1 = new Address("232", "Viljoen Street", "Krugersdorp", "Gauteng", "1739");
        ContactInfo contact1 = new ContactInfo("0799977183", "jacob.williams@gmail.com");

        Patient patient1 = new Patient("Jacob Williams", "Male", 76, "White",
                "P001", "Heart Disease and Hypertension",
                addr1, contact1);
        patientService.registerPatient(patient1);

        Address addr2 = new Address("10063", "Mogale Drive", "Delareyville", "North West", "1003");
        ContactInfo contact2 = new ContactInfo("073-455-4324", "amogelang.makgoana@gmail.com");

        Patient patient2 = new Patient("Thato", "Female", 25, "Black",
                "P002", "Asthma", addr2, contact2);
        patientService.registerPatient(patient2);

        // -------------------- 6️⃣ Schedule Appointments --------------------
        Appointment appt1 = new Appointment("A001",
                LocalDate.of(2025, 1, 15), LocalTime.of(10, 30),
                doctor1, patient1, "Routine check-up");
        appointmentService.scheduleAppointment(appt1);

        Appointment appt2 = new Appointment("A002",
                LocalDate.of(2025, 1, 15), LocalTime.of(11, 30),
                doctor2, patient2, "Skin rash consultation");
        appointmentService.scheduleAppointment(appt2);

        // Attempt double-booking for same doctor
        Appointment duplicate = new Appointment("A003",
                LocalDate.of(2025, 1, 15), LocalTime.of(10, 30),
                doctor1, patient2, "Follow-up");
        appointmentService.scheduleAppointment(duplicate);  // Should fail

        // -------------------- 7️⃣ View Appointments --------------------
        appointmentService.listAllAppointments();
        appointmentService.viewDoctorSchedule("D001");
        appointmentService.viewPatientAppointments("P002");
        appointmentService.showAvailableSlots("D001", LocalDate.of(2025, 1, 15));

        // -------------------- 8️⃣ Doctor Operations --------------------
        doctorService.viewPatientDetails("P001");
        doctorService.diagnose("P001", "Acute chest pain, prescribed beta-blockers");
        doctorService.addNotes("P001", "Patient needs follow-up in 2 weeks.");
        doctorService.prescribe("P001", "Metoprolol 50mg twice daily");

        // -------------------- 9️⃣ Nurse Operations --------------------
        nurseService.viewPatientDetails("P001");
        nurseService.addNursingNotes("P001", "Vitals checked: BP 140/90, HR 78. Patient resting comfortably.");
        nurseService.viewDoctorNotes("P001");

        // -------------------- 🔟 Update Patient Info --------------------
        Address newAddr = new Address("500", "Main Street", "Sandton", "Gauteng", "2000");
        ContactInfo newContact = new ContactInfo("011-999-8888", "jacob.new@gmail.com");
        patientService.updatePatientDetails("P001", "Heart Disease and Hypertension | Diabetes", newAddr, newContact);
        patientService.viewPatientDetails("P001");

        // -------------------- 1️⃣1️⃣ Test HashMap Performance --------------------
        for(int i=3; i<=102; i++){
            String id = String.format("P%03d", i);
            Patient p = new Patient("Patient "+i, "Male", 30, "Race",
                    id, "No history",
                    new Address("1", "Street", "City", "Province", "1234"),
                    new ContactInfo("0123456789", "test@email.com"));
            patientService.registerPatient(p);
        }
        System.out.println("Total patients registered: " + patientService.getTotalPatients());
        Patient found = patientService.getPatient("P050");
        System.out.println("Lookup test - Found: " + (found != null ? found.getName() : "Not found"));

        // -------------------- 1️⃣2️⃣ Test Utilities --------------------
        Set<String> specialties = HospitalUtil.extractUniqueSpecialties(doctorList);
        System.out.println("\nUnique doctor specialties: " + specialties);

        List<String> visitHistory = HospitalUtil.visitHistory(Arrays.asList("P001 visit", "P002 visit", "P001 follow-up"));
        System.out.println("Visit history (ordered): " + visitHistory);

        Set<String> uniquePatients = HospitalUtil.convertToUniqueSet(Arrays.asList("P001", "P002", "P001", "P003"));
        System.out.println("Unique patients: " + uniquePatients);

        System.out.println("\n====== HOSPITAL SYSTEM TEST END ======");
    }
}
