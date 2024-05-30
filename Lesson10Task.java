import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    String[] partyList = new String[5]; // 5 people is ok, I'm not that popular
    partyList[0] = "Aija";
    partyList[1] = "Alekss";
    partyList[2] = "Zane";
    partyList[3] = "Inga";
    partyList[4] = "Jānis";

    Scanner scanner = new Scanner(System.in);
    System.out.println("What's your name? ");
    String name = scanner.nextLine();
    
    for (int i = 0; i < partyList.length; i++) {
      if (partyList[i].equals(name)) {
        System.out.println(name + " is invited!");
      } else if (!partyList[i].equals(name)){
        System.out.println(name + " is not invited!");
      }
    }  
    scanner.close();
  }
}
