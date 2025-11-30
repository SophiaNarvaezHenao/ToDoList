import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> tasks = new ArrayList<>();
        List<String> compTasks = new ArrayList<>();
        System.out.println("Welcome to the To-Do List Application!");
        while (true) {
            System.out.println("What do you want to do?\n1. View tasks\n2. View completed task\n3. Add  a task\n4. Mark task as completed \n5. Move Task Priority\n6. Exit");
            String option = sc.nextLine();
            switch (option) {
                case "1":
                    Manager.viewTasks(tasks);
                    System.out.println("(Press Enter)");
                    sc.nextLine();
                    break;
                case "2":
                    Manager.viewTasks(compTasks);
                    System.out.println("(Press Enter)");
                    sc.nextLine();
                    break;
                case "3":
                    System.out.println("Enter the task to add:");
                    String task = sc.nextLine();
                    Manager.addTask(tasks, task);
                    System.out.println("(Press Enter)");
                    sc.nextLine();
                    break;
                case "4":
                    Manager.complet(tasks, compTasks);
                    System.out.println("(Press Enter)");
                    sc.nextLine();
                    break;
                case "5":
                    Manager.movePriority(tasks);
                    System.out.println("(Press Enter)");
                    sc.nextLine();
                    break;
                case "6":
                    System.out.println("Exiting the application. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}