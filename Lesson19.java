import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> shopsItems = new ArrayList<String>();
    shopsItems.add("Glass table");    
    shopsItems.add("Wooden table"); 
    shopsItems.add("Round table"); 
    shopsItems.add("Doors");
    shopsItems.add("Trapdoor");
    shopsItems.add("Couch");
    shopsItems.add("Bed"); 
    shopsItems.add("Sofa"); 

    ArrayList<String> filteredItems = new ArrayList<String>();
    for (String item : shopsItems) {
      if (item.contains("table")) {
        filteredItems.add(item);
      }
    }
    System.out.println(filteredItems);

    shopsItems
      .stream()
      .forEach(x -> print(x)); // can use a custom method within the stream

    // var filteredItemsStream = shopsItems
    //   .stream()
    //   // can do actions in the part between .stream() and .collect()
    //   .skip(3) // skipping the first 3 elements 
    //   .limit(2) // selecting the first 2 elements only
    //   //.filter(item -> item.contains("table")) // if true, item will be returned
    //   .forEach(x -> System.out.println("TEST" + x));
    //   //.collect(Collectors.toList()); // cannot use forEach and collector together 

    // System.out.println(filteredItemsStream);
  }

  public static void print(String text) {
    System.out.println();
    System.out.println(text);
  }
}
