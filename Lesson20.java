import java.util.ArrayList;

public class Choir {

  // class variables
  public static int totalSingers = 0;

  // class atributes
  public Person singer;
  public String choirName;
  public boolean isActive = true;
  public String typeOfChoir;
  public ArrayList<Person> members = new ArrayList<Person>();
  
  // constructor
  public Choir(String name) {
    choirName = name;
  }

  // getters and setters
  public String getChoirName() {
    return choirName;
  }

  public void setChoirTye(String typeOfChoir) {
    this.typeOfChoir = typeOfChoir;
  }

  public String getTypeOfChoir() {
    return typeOfChoir;
  }

  public void setActivityStatus(boolean isActive) {
    this.isActive = isActive;
  }

  public boolean getActivityStatus() {
    return isActive;
  }

  // custom methods
  public void sing() {
    System.out.println("La la la la laaaaaaaaaa");
  }  

  public ArrayList<Person> addSingerToMembers(Person singer) {
    if (this.isActive == true) {      
      this.members.add(singer);
      totalSingers++;
    }
    return this.members;
  }

  public void printSingersList(Choir choir) {
    for (Person singer : choir.members) {
      System.out.println(singer.name);
    }
  }
}
