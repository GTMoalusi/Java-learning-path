package Console_Based_Task_Manager;

public class Task {

    public enum Status{
        TODO,
        DONE
    }

    // Fields
    private final String taskId;
    private String titleOfTask;
    private String taskDescription;
    private Status status;

    // Constructor
    public Task(String taskId, String titleOfTask, String taskDescription){
        this.taskId = taskId;
        this.titleOfTask = titleOfTask;
        this.taskDescription = taskDescription;
        this.status = Status.TODO;
    }

    // Getters
    public String getTaskId() {
        return taskId;
    }

    public String getTitleOfTask() {
        return titleOfTask;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    // Setter

    public void setTitleOfTask(String titleOfTask) {
        this.titleOfTask = titleOfTask;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    // Unique Methods
    public void markAsDone() {
        this.status = Status.DONE;
    }

    public void markAsTodo() {
        this.status = Status.TODO;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString(){
        return "TaskId: " + taskId +
                "\nTask title: " + titleOfTask +
                "\nTask description: " + taskDescription +
                "\nStatus: " + status;
    }
}