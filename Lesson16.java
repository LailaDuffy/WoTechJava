
public class Main {
  public static void main(String[] args) {

    int number = 20;

    number = changeNumber(number);
    System.out.println(number);

    int numberVoid = 20;
    changeNumberVoid(numberVoid);
    System.out.println(numberVoid);

    int[] array = {1, 2, 3, 4, 5};
    changeArray(array);
    printOutArray(array);

    changeArrayVoid(array);
    printOutArray(array);
    
    
  }

  // Value type 
  public static int changeNumber(int num) {
    num = 55;
    return num;
  }

  // Value type 2
  public static void changeNumberVoid(int num) {
    num = 55; // this will not change the numberVoid value
  }

  public static int[] changeArray(int[] array) {
    for(int i = 0; i < array.length; i++) {
      array[i] = 0;
    }
    return array;
  }

  public static void printOutArray(int[] array){
      for(int i = 0; i < array.length; i++){
          System.out.println(array[i]);
      }
  }

  public static void changeArrayVoid(int[] array) {
    for(int i = 0; i < array.length; i++) {
      array[i] = 1;
    }
  }
}
