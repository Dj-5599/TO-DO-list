import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoApp {
    private List<String> tasks;
    private Scanner scanner; // Corrected variable name to 'scanner'

    public TodoApp() {
        tasks = new ArrayList<>();
        scanner = new Scanner(System.in); // Corrected variable name to 'scanner'
    }

    private void run() {
        boolean running = true;
        while (running) {
            System.out.println("\n ------TO DO LIST-------\n");
            System.out.println("1. Add task");
            System.out.println("2. Delete task");
            System.out.println("3. View all tasks");
            System.out.println("4. Quit");
            System.out.println("\nEnter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Corrected variable name to 'scanner'

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    deleteTask();
                    break;
                case 3:
                    displayTasks(); // Corrected method name to 'displayTasks'
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    private void addTask() {
        System.out.println("\nEnter task: ");
        String task = scanner.nextLine(); // Corrected variable name to 'scanner'
        tasks.add(task);
        System.out.println("Task added successfully");
    }

    private void deleteTask() {
        System.out.println("\nEnter task number to delete: ");
        int taskNum = scanner.nextInt();
        scanner.nextLine(); // Corrected variable name to 'scanner'
        if (taskNum > 0 && taskNum <= tasks.size()) {
            tasks.remove(taskNum - 1); // Removed 'index:' keyword
            System.out.println("Task deleted successfully");
        } else {
            System.out.println("Invalid task number");
        }
    }

    private void displayTasks() { // Corrected method name to 'displayTasks'
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i)); // Changed ',' to '.'
            }
        }
    }

    public static void main(String[] args) {
        TodoApp app = new TodoApp();
        app.run(); // Start the application
    }
}
