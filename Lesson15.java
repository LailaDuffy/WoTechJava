
public class Main {
  public static void main(String[] args) {

    int[] array = {1, 2, 3};
    int[][] array2D = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };

    // iterating through 1D array
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }

    // iterating through 2D array
    for (int i = 0; i < array2D.length; i++) {
      for( int j = 0; j < array2D[i].length; j++) {
      System.out.println(array2D[i][j]);
      }
    }

    // iterating the rows of 2D array  
    for(int i = 0; i < array2D.length; i++){ 
    //array[0] = {1, 2, 3}
    //array[0].length = 3
      int[] row = array2D[i]; // {1, 2, 3} OR {4, 5, 6} OR, {7, 8, 9}
      for(int j = 0; j < row.length; j++){
          System.out.print(row[j]); //PROCESSING ROWS HERE
      }
    System.out.println();
    }

    int[][] array2D2 = new int[5][5];
    
    for (int i = 0; i < array2D2.length; i++) {
        int[] row = array2D2[i];
        for (int j = 0; j < row.length; j++) {
            row[j] = 1;
        }
    }

    for(int i = 0; i < array2D2.length; i++){
        for(int j = 0; j < array2D2[i].length; j++){
            System.out.print(array2D2[i][j] + "|");
        }
        System.out.println();
        System.out.println("----------");
    }

    int[][] multiTable = new int[10][10]; 
    for (int i = 0; i < multiTable.length; i++) {
        int[] row = multiTable[i];
        for (int j = 0; j < row.length; j++) {
            row[j] = i*j;
        }
    }
    for(int i = 0; i < multiTable.length; i++){
        for(int j = 0; j < multiTable[i].length; j++){
            if(multiTable[i][j] < 10){
              System.out.print(multiTable[i][j] + "  ");
             }
            else{
               System.out.print(multiTable[i][j] + " ");
            }
        }
      System.out.println();
    }
  }

}
