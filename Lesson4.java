
public class Main {
  public static void main(String[] args) {
    

    // Application where a door has a lock and it can be locked or unlocked
    boolean isDoorLocked = false;

    if (isDoorLocked) { // the statement works using (isDoorLocked) as well as (isDoorLocked == true), because both are boolean
    System.out.println("Door is locked");
    } else {
      System.out.println("Door is unlocked");
    }

    // Application where need to check if the person is on the invoted list
    String name = "Oskars";

    if (name == "Elchin" || name == "Anna") {
      System.out.println("You are welcome!");
    }
    boolean isElchin = name == "Elchin"; // (name == "Elchin") checks if the variable name is equal to Elchin
    // it is not as name == "Oskars", so isElchin is false
    boolean isAnna = (name == "Anna"); // the String definition can be put in brackets too
    boolean isInvited = isElchin || isAnna;
    if (isInvited) {
      System.out.println("You are invited!");
    } else {
      System.out.println("Sorry, you are not invited!");
    }

    // defining a student
    int yearOfSchool = 12;
    String stutendName = "Anna";
    double studentAge = 18.5;
    double grade = 6.8;
    boolean olympicsWinner = true;

    // the condition to accept student into university
    // studentAge 18 or older 
    // AND grade must be more of equal to 8
    // OR shudent has won an olimpiad winner
    if (studentAge >= 18 && (grade >= 8 || olympicsWinner)) {
      System.out.println("You are accepted!");
    } else {
      System.out.println("You are not accepted!");
    }

    boolean isAgeEligible = studentAge >= 18; // checking is done before the if statement, making the code better quality
    boolean isGradeEligible = grade >= 8;
  
    if (isAgeEligible && (isGradeEligible || olympicsWinner)) { // must put OR comparison in () to make sure the logic is correct
      System.out.println("You are accepted!");
      } else {
        System.out.println("You are not accepted!");
    }

    // code from ChatGPT 3.5 to be analyzed - conditions to be accepted into university 
    if (isAgeEligible && (isGradeEligible || olympicsWinner)) {
      System.out.println("You are accepted!");
    } else {
      System.out.println("You are not accepted. Reasons:");

      if (!isAgeEligible) {
        System.out.println("- You are not eligible due to age.");
      }
      if (!isGradeEligible && !olympicsWinner) {
        System.out.println("- You are not eligible due to insufficient grade OR ");
        System.out.println("due to not being an Olympics winner.");
      }
      // the below code was analysed as not needed because being under 18 is not eligible, and either of the other 2 conditions
      //if (!olympicsWinner && isAgeEligible && isGradeEligible) {
        //System.out.println("- You are not eligible due to not being an Olympics winner.");
      //}
    }
      // Exercises from Oskars:
      // AND
      // I will be able to open the doors, if the first key is unlocked AND if the second key is unlocked.
      boolean firstKeyUnlocked = true;
      boolean secondKeyUnlocked = true;
      if (firstKeyUnlocked && secondKeyUnlocked) {
        System.out.println("The door is open!");
      } else {
        System.out.println("The door is locked.");
      }
    
      
     // I will log you in if your username is correct AND if your password is correct.
      String username = "user123";
      String password = "password123";
      if (username == "user123" && password == "password123") {
        System.out.println("You are logged in!");
      } else {
        System.out.println("Username or password is incorrect.");
      }

      // OR
      // I will buy eggs if they will be on the sale OR they will cost less than 2.50
          boolean sale = true;
          double eggPrice = 3.50;
          boolean price = eggPrice < 2.50; 
          if (sale || price) {
            System.out.println("You can buy the eggs!");
          } else {
            System.out.println("You cannot buy the eggs. Reason: ");
          
            if (!sale) {
              System.out.println("The eggs are not on sale.");
            }
            if (!price) {
              System.out.println("The eggs are not cheap enough.");
            }
          }
    
      // I will go running, if I will have enough energy OR if the weather is shiny.
      boolean hasEnoughEnergy = true;
      boolean isWeatherSunny = true;

      if (hasEnoughEnergy || isWeatherSunny) {
        System.out.println("I'll go for the run!");
      } else {
        System.out.println("I'll stay home and read a book.");
      }


      // AND OR
      // I will go in this restaurant if there is going to be squid OR shrimps, AND I need there to have white wine as well
      boolean hasSquid = false;
      boolean hasShrimps = false;
      boolean hasWhiteWine = true;

      if ((hasSquid || hasShrimps) && hasWhiteWine) {
        System.out.println("I'm going to the restaurant!");
      } else {
        System.out.println("I'm not going to the restaurant.");
      }

      // NOT
      // I will go to a restaurant, if the waitress is NOT rude
      boolean waitressIsRude = true; 

      if (!waitressIsRude) {
        System.out.println("I'm going to the restaurant! The staff are very nice there.");
      } else {
        System.out.println("I won't go to the restaurant. The waitress is rude.");
      }

      // Combine NOT with AND OR
      // I will go in this restaurant if there is going to be squid or shrimps, and I need there to have white wine as well.     
      // ALSO, waitress should NOT be rude
      if ((hasSquid || hasShrimps) && hasWhiteWine && !waitressIsRude) {
        System.out.println("I'm going to the restaurant!");
      } else {
        System.out.println("I'm not going to the restaurant, because: ");

        if (waitressIsRude) {
          System.out.println(" - The waitress is rude, I'm not going there.");
        }
        if (!hasWhiteWine) {
          System.out.println(" - They don't have white wine, I'm not going there.");
        }
        if (!hasSquid && !hasShrimps) {
          System.out.println(" - They don't have squid or shrimps, I'm not going there.");
        }
      } 
  }
 }
