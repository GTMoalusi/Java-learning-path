package Student;

public class Student {
    //Attributes
    private String name;
    private String studentId;

    //Constructor
    public Student(String name, String studentId){
        this.name = name;
        this.studentId = studentId;
    }

    //Getters
    public String getName() {
        return name;
    }
    public String getStudentId() {
        return studentId;
    }
}
