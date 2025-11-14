package Interface;

public interface Schedulable {

    String ID_TAG_POLICY = "Every staff member must wear their ID tags at all times.";

    static void displayPolicy() {
        System.out.println("⚠️ POLICY: " + ID_TAG_POLICY);
    }

    void scheduleAppointment();

}
