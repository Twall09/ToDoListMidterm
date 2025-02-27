package todolist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User[] users = new User[5]; // Store up to 5 users
        int userCount = 0; // tracks the number of users

        while (true) {
            System.out.println("\n1. Create User\n2. Add Task\n3. Mark Task as Completed\n4. View Tasks\n5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: // create new user
                    if (userCount < users.length) {
                        System.out.print("Enter username: ");
                        String name = scanner.nextLine();
                        users[userCount++] = new User(name);
                        System.out.println("User created successfully!");
                    } else {
                        System.out.println("User limit reached!");
                    }
                    break;

                case 2: // add a task to a user
                    System.out.print("Enter username: ");
                    String userName = scanner.nextLine();
                    User user = findUser(users, userName, userCount);
                    if (user != null) {
                        System.out.print("Enter task description: ");
                        String taskDesc = scanner.nextLine();
                        user.addTask(taskDesc);
                        System.out.println("Task added!");
                    } else {
                        System.out.println("User not found!");
                    }
                    break;

                case 3: // mark a task as completed
                    System.out.print("Enter username: ");
                    userName = scanner.nextLine();
                    user = findUser(users, userName, userCount);
                    if (user != null) {
                        System.out.print("Enter task description to mark as completed: ");
                        String taskDesc = scanner.nextLine();
                        user.markTaskCompleted(taskDesc);
                        System.out.println("Task marked as completed!");
                    } else {
                        System.out.println("User not found!");
                    }
                    break;

                case 4: // view tasks of a user
                    System.out.print("Enter username: ");
                    userName = scanner.nextLine();
                    user = findUser(users, userName, userCount);
                    if (user != null) {
                        user.printTasks();
                    } else {
                        System.out.println("User not found!");
                    }
                    break;

                case 5: // exit
                    System.out.println("Exit");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static User findUser(User[] users, String name, int count) {
        for (int i = 0; i < count; i++) {
            if (users[i].getName().equals(name)) {
                return users[i];
            }
        }
        return null;
    }
}

