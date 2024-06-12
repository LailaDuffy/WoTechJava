public class Task {
  // name, description, itIsDone
  public String name;
  public String description;
  public boolean isDone;

  public Task(String name, String description) {
    this.name = name;
    this.description = description;
    // dont need to add this.isDone = false; as default value for boolean is false
  }  
}
