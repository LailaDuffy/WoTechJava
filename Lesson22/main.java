/*main.java -> we are getting the user input, we are sending this input to taskManager, show information to the user
taskManager.java -> we can add tasks to the list, we can mark them as done and we can get the list
task.java -> template for a task (name, description, date, itIsDone)*/

import java.util.Scanner;
import java.util.ArrayList;

public class Main { // this acts as an UI where Scanner and out.print functionality should be used
  public static TaskManager taskManager = new TaskManager();
  
  public static void main(String[] args) {
    // create a menu:
    // use scanner
    // if user selects 1, call createTask
    // user selects 2, call showToDoList
    // selects 3, mark a task with isDone as true
    // put into while loop
    // if writes 4, exit the loop
    while (true) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter 1 to create a task");
      System.out.println("Enter 2 to show the todo list");
      System.out.println("Enter 3 to set a task as done");
      System.out.println("Write 4 to exit");
      String userInput = scan.nextLine();
      if (userInput.equals("1")) {
        createTask(); 
      } else if (userInput.equals("2")) {
        showToDoList();
      } else if (userInput.equals("3")) {
        System.out.println("Enter the finished task name: ");
        String taskName = scan.nextLine();
        taskManager.setTaskAsDone(taskName);
      } else {
        break;
      }
      scan.close();
    }     
  }

  public static void createTask() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the task name: ");
    String name = scan.nextLine();
    System.out.println("Please enter the task description: ");
    String description = scan.nextLine();
    Task task = new Task(name, description);
    taskManager.addTask(task);
  }

  public static void showToDoList() {
    ArrayList<Task> tasks = taskManager.getTasks();
    for (Task task : tasks) {
      System.out.println("This is a TASK:");
      System.out.println(task.name);
      System.out.println(task.description);
      System.out.println("Done: " + task.isDone);
    }
  }
}
