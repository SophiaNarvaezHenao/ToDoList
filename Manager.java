import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {

    public static void viewTasks(List<String> arr) {
        Scanner sc = new Scanner(System.in);
        if (arr.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Tasks:");
            for (int i = 0; i < arr.size(); i++) {
                System.out.println((i + 1) + ". " + arr.get(i));
            }
        }
    }

    public static void addTask(List<String> arr, String task) {
        Scanner sc = new Scanner(System.in);
        arr.add(task);
        System.out.println("Task added: " + task);
    }

    public static void complet(List<String> task, List<String> complete) {
        if (task.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        System.out.println("You completed the task with the highest priority!");
        complete.add(task.get(0));
        task.remove(0);
    }

    public static void movePriority(List<String> task) {
        Scanner sc = new Scanner(System.in);
        if (task.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        viewTasks(task);
        try {
            System.out.println("Enter the task number to move: ");
            int taskNumber = sc.nextInt();
            System.out.println("Enter the new position for the task: ");
            int newPosition = sc.nextInt();
            if (taskNumber < 1 || taskNumber > task.size() || newPosition < 1 || newPosition > task.size()) {
                System.out.println("Invalid task number or position.");
                return;
            }
            String taskMove = task.get(taskNumber - 1);
            task.remove(taskNumber - 1);
            task.add(newPosition - 1, taskMove);
            System.out.println("Task moved successfully.");
            System.out.println("Now task " + taskNumber + " is at position " + newPosition + ".");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values.");
        }
    }
}
