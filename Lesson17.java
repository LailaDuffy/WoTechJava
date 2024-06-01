public class Main {
  public static void main(String[] args) {
    int size = 3;
    int[][] grid = new int[size][size];

    //funExperiment(grid, size); 
    //cross(grid, size);
    waves(grid, size);
    printArray(grid, size);
    
  }

  public static void printArray(int[][] array, int size) {
    for (int i = 0; i < size; i++){
      for (int j = 0; j < size; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }

  /*public static void funExperiment (int[][] grid, int size) {
    for (int i = 0; i < size; i++){
      for (int j = 0; j < size; j++) {
        if(i != 0) {
          grid[i - 1][j]++; // Top middle
          if(j != 0){
              grid[i - 1][j - 1]++; // top left
          }
          if(j != size - 1){
              grid[i - 1][j + 1]++; // top right
          }
        }
        
        if(i != size - 1){
          grid[i + 1][j]++; // bottom middle
          if(j != 0){
              grid[i + 1][j - 1]++; //bottom left
          }
          if(j != size - 1){
              grid[i + 1][j + 1]++; //bottom right
          }

        }

        if(j != 0){
          grid[i][j - 1]++; // middle left
        }
        if(j != size - 1){
          grid[i][j + 1]++; //middle right
        }
        
      }
    }
  }*/

  public static void cross(int[][] grid, int size) {
    for (int i = 0; i < size; i++){
      for (int j = 0; j < size; j++) {
        if (size % 2 == 0) {
          if (i == size/2 || i == size/2-1){
            grid[i][j] = 1;
          }
          if (j == size/2 || j == size/2 -1){
            grid[i][j] = 1;
        }    
        } else {
          if (i == size/2 -1 || i == size/2 || i == size/2+1){
            grid[i][j] = 1;
          }
          if (j == size/2 -1 || j == size/2 || j == size/2 +1){
            grid[i][j] = 1;
          }
        }
      }
    }
  }

  public static void waves(int[][] grid, int size) {
    for (int i = 0; i < size; i++){
      for (int j = 0; j < size; j++) {
        if (size % 2 == 0) {
          for (i = 0; i < size/5; i++){
            grid[i][j] = 1;
          }
          for (j = 0; j < size/5; j++){
            grid[i][j] = 1;
        }    
        } else {
            for (i = 0; i < size/3; i++){
              grid[i][j] = 1;
            }
            for (j = 0; j < size/3; j++){
              grid[i][j] = 1;
          }
        }
      }
    }
  }
}
