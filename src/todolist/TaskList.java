package todolist;

public class TaskList {
    private Task head; // head means first task

    public void addTask(String description) {
        Task newTask = new Task(description); //  creates new task
        if (head == null) {
            head = newTask;
        } else {
            Task temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newTask; // once first task completed, add new one at the end
        }
    }

    public void markTaskCompleted(String description) {
        Task temp = head;
        while (temp != null) {
            if (temp.getDescription().equals(description)) {
                temp.markCompleted();  // if task found, mark it completed
                return;
            }
            temp = temp.next; // move to next taks
        }
    }

    // displays the tasks and their status
    public void printTasks() {
        Task temp = head;
        while (temp != null) {
            System.out.println(temp.getDescription() + " - " + (temp.isCompleted() ? "Completed" : "Pending"));
            temp = temp.next;
        }
    }
}

