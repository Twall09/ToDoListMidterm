package todolist;

public class Task {
    private String description;
    private boolean isCompleted; // tells whether the task is completed
    Task next; // for the next task in list

    public Task(String description) {
        this.description = description;
        this.isCompleted = false; // means not completed
        this.next = null; // next task is empty
    }

    public void markCompleted() {
        this.isCompleted = true; // marks task completed
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }
}

