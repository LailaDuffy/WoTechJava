/*Fill the party list with people you would like to invite to the party.
Check whether or not "Anna" is in the array.
Check whether or not "Maris" is in the array.
["Oskars", "Anna", "Andris"]
Result: 
"Anna is in the party list"
"Maris is not in the party list"
*/

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of people you want to invite to the party: ");
    int number = scanner.nextInt();
    String[] partyList = new String[number];
   
    fillThePartyList(partyList);

    checkPartyList(partyList);  
    
  }

  public static void fillThePartyList(String[] partyList) {
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < partyList.length; i++) {
      System.out.println("Enter a name of an invitee: ");
      String invitee = scanner.next();
      partyList[i] = invitee;
    }
  }

  public static void checkPartyList(String[] partyList) {
    System.out.println("Let's check who's on the party list!");
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < 10; i++) { // names can be checked 10 times hardcoded
      System.out.println("Enter a name of a person: ");
      String person = scanner.next();
      if (partyList[i].equals(person)) {
        System.out.println(person + " is in the party list");
      } else {
        System.out.println(person + " is not in the party list");
      }
    }
  }
}
