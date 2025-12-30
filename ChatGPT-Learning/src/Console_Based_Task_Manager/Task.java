package Console_Based_Task_Manager;

public class Task {

    // Fields
    private String taskId;
    private String titleOfTask;
    private String taskDescription;
    private boolean taskStatus;

    // Constructor
    public Task(String taskId, String titleOfTask, String taskDescription){
        this.taskId = taskId;
        this.titleOfTask = titleOfTask;
        this.taskDescription = taskDescription;
        this.taskStatus = false;
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

    public boolean isTaskStatus() {
        return taskStatus;
    }

    // Setter
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public void setTitleOfTask(String titleOfTask) {
        this.titleOfTask = titleOfTask;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public void setTaskStatus(boolean taskStatus) {
        this.taskStatus = taskStatus;
    }

    @Override
    public String toString(){
        return "TaskId: " + taskId +
                "\nTask title: " + titleOfTask +
                "\nTask description: " + taskDescription;
    }
}