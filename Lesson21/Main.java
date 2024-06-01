public class Main {
  public static void main(String[] args) {
    Student student = new Student();
    student.name = "John";
    Student student2 = new Student();
    System.out.println(student2.name);

    // accessing the global variable
    // Static variables are associated with the class itself rather than with any specific instance of the class. 
    // They can be accessed using the class name and are shared among all instances of the class.
    System.out.println(Student.studentCount);

    // calling static method main - this would cause the main method calling itself forever
    // Main.main(args);

    Square square1 = new Square(3);
    // it's better to assign a varibale for the method
    int square1Perim = square1.getPerimeter();
    int square1Area = square1.getArea();
    System.out.println(square1Perim);
    System.out.println(square1Area);

    Square square2 = new Square(100);
    int square2Perim = square2.getPerimeter();
    int square2Area = square2.getPerimeter();
    System.out.println(square2Perim);
    System.out.println(square2Area);

    Fork fork = new Fork(4, "Silver");

    System.out.println("Fork is made out of " + fork.material);
    System.out.println("Fork has " + fork.spikeCount + " spikes in total.");
    System.out.println("And the sharpness is " + fork.sharpness);

    // creating a stabbing machine    
    for (int i = 0; i < 10; i++) {
      fork.stab();
    }
    System.out.println("The sharpness after 10 stabs is " + fork.sharpness);
  }
}
