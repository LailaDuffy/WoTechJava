
public class Main {
  public static void main(String[] args) {

    int[] array = {8, 7, 5, 3, 2, 1}; // current race results
    int number = 1; // our result
    int place = getThePlace(array, number);
    System.out.println("Our place in the race is: " + place);

    for (int i = 0; i <100; i++) {
      boolean isPrimeNumber = isPrime(i);
      System.out.println(i + " is a prime number - " + isPrimeNumber);
    }
    
    
  }

  public static int getThePlace(int[] array, int number) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] < number) {
        return i + 1;
      }
    }
    return array.length + 1;
    }
  

  public static boolean isPrime(int number) {
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
      return false;
      }    
    }
    return true;
  }
      
  
}
