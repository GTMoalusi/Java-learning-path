package HospitalRoleSystem;

public interface HospitalRole {

    void performDuty();

    //Static method
    static void HospitalPolicy(){
        System.out.println("========== ●All personnel must wear ID badges and maintain hygiene● ==========");
    }
}
