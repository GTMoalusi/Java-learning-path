package util;

import model.Doctor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HospitalUtil {

    // 1️⃣ Unique doctor specialties (HashSet)
    public static Set<String> extractUniqueSpecialties(List<Doctor> doctors) {
        Set<String> specialties = new HashSet<>();
        for (Doctor doc : doctors) {
            specialties.add(doc.getSpecialization());
        }
        return specialties;
    }

    // 2️⃣ Keep visit history in order (ArrayList)
    public static List<String> visitHistory(List<String> visits) {
        return new ArrayList<>(visits);
    }

    // 3️⃣ Convert patient list → unique set
    public static Set<String> convertToUniqueSet(List<String> names) {
        return new HashSet<>(names);
    }

}
