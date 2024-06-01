/*
Grades in university
You have 3 students, each one of them has grades. (three different int arrays) 
Calculate the average grade for each student (sum of all grades and divide by grade count)

Example:
robertsGrades {8, 6, 7, 9, 10}
annasGrades {7, 10, 10, 9, 6}
franceskasGrades {8, 8, 8, 7, 6}

Result:
Robert's average grade is 8
Anna's average grade is 8.4
Franceska's average grade is 7.4
*/
public class Main {
  public static void main(String[] args) {
    int[] robertsGrades = {8, 6, 7, 9, 10};
    int[] annasGrades = {7, 10, 10, 9, 6};
    int[] franceskasGrades = {8, 8, 8, 7, 6};

    System.out.println("Robert's average grade is " + calculateAverage(robertsGrades));
    System.out.println("Anna's average grade is " + calculateAverage(annasGrades));
    System.out.println("Franceska's average grade is " + calculateAverage(franceskasGrades));
  
  }

  public static double calculateAverage(int[] grades) {
    double sum = 0;
    for (double grade : grades) {
      sum += grade;
    }
    double average = Double.valueOf(sum/grades.length);
    return average;
  }
}
