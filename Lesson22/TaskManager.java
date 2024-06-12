import java.util.ArrayList;

public class TaskManager {
  //MVP: Minimum Viable Product
  //Be able to add a Task
  //Have a list of all the tasks
  //Set a task as done, by Task name

  private ArrayList<Task> tasks = new ArrayList<Task>(); // private so no other class can access it, needs a getter method for access

  // because we want to use default constructor for TaskManager, don't need to add a custom one

  // adding a task to the task list
  public void addTask(Task task) {
    tasks.add(task);
  }

  // GETTER METHOD
  public ArrayList<Task> getTasks() {
    // the tasks variable cannot be overwritten - ENCAPSULATION
    return tasks;
  }

  // set task as done
  public void setTaskAsDone(String taskName) {
    tasks.stream()
      .filter(x -> x.name.equals(taskName))
      .findFirst()
      .ifPresent(x -> x.isDone = true);
  }

  //BONUS:
  //Get a random quote to stop procrastinating
  //A list of undone tasks - filter
  //A list of done tasks - filter  
}
