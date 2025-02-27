package todolist;

public class User {
    private String name;
    private TaskList taskList; // each user has their list

    public User(String name) {
        this.name = name;
        this.taskList = new TaskList();
    }

    public void addTask(String description) {
        taskList.addTask(description);
    }

    public void markTaskCompleted(String description) {
        taskList.markTaskCompleted(description);
    }

    public void printTasks() {
        System.out.println("Tasks for " + name + ":");
        taskList.printTasks();
    }

    public String getName() {
        return name;
    }
}

