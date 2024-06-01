//THIS IS NOT FINISHED!!!

/*Suppose you are writing an embed soft (meaning soft for devices, such as fitness equipment, laundry machines, teapots, etc). 

Ask the user to enter workout time in minutes
Validate to be between 1 and 999
Request repeatedly if not in that range
Assume min and max difficulty levels are 1 and 7 respectively
Split the workout time periods in 20 second intervals
Create an array of difficulty levels
Generate random difficulty levels with the following rule:

7.1. the first level is always 1
7.2. the next 2 minutes difficulty can be between 1 and 3
7.3. after thet difficulty level is random between 1 and 7

You can challenge yourself to control clustering (meaning low values follow by low values for certain time, while higher follow by higher) or other creative ideas 
*/

import java.util.Scanner; 


public class Main {
  Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args) {

    // Ask the user to enter workout time in minutes    
    System.out.print("Enter workout time in minutes: ");
    int workoutTime = scanner.nextInt();

    // Validate to be between 1 and 999
    if (workoutTime < 1 || workoutTime > 999) {
      // Request repeatedly if not in that range
      System.out.println("Invalid workout time. Please enter a value between 1 and 999:");
      workoutTime = scanner.nextInt();
    }

    // Assume min and max difficulty levels are 1 and 7 respectively
    int minLevel = 1;
    int maxLevel = 7;

    // Split the workout time periods in 20 second intervals
    int interval = 20;
    int numIntervals = workoutTime*60 / interval;

    generateTheWorkout(minLevel, maxLevel, numIntervals);
  }
  
  public static void validateInput(int workoutTime) {
    if (workoutTime < 1 || workoutTime > 999) {
      // Request repeatedly if not in that range
      System.out.print("Invalid workout time. Please enter a value between 1 and 999:");
      workoutTime = scanner.nextInt();
    }
  }

  // Generate random difficulty levels
  public static int generateDifficultyLevel(int min, int max) {
    int range = (max - min) + 1;
    return (int)(Math.random() * range) + min;    
  }

  public static void generateTheWorkout(int minLevel, int maxLevel, int numIntervals) {
    
    // Create an array of difficulty levels
    int[] difficultyLevels = new int[numIntervals];

    // Generate random difficulty levels with the following rule:
    // 7.1. the first level is always 1
    // 7.2. the next 2 minutes difficulty can be between 1 and 3
    // 7.3. after thet difficulty level is random between 1 and 7
    // 7.4. the last 2 minutes difficulty can be between 1 and 3
    difficultyLevels[0] = minLevel;
    for (int i = 1; i < numIntervals; i++) {
      if (i < 7) {
        difficultyLevels[i] = generateDifficultyLevel(minLevel, minLevel + 2);
      } else if (i >= 7 && i < numIntervals - 6) {
        difficultyLevels[i] = generateDifficultyLevel(minLevel, maxLevel);  
      } else {
        difficultyLevels[i] = generateDifficultyLevel(minLevel, minLevel + 2);
      }
    }
  }
}
