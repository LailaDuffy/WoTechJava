/*
Create a program, where user can provide a title and a small text below the title.
Title should be wrapped with ====== at top and bottom, based on the title length.
Example: 
System asks for title and user provides "WoTech and Java is easy"
System asks for description and user provides "I have been learning Java for 6 weeks now."

Result: 
=======================
WoTech and Java is easy
=======================

I have been learning Java for 6 weeks now.
  */

import java.util.Scanner;

public class Task2 {
  public static void task2(){

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please write a text for the title: ");
    String title = scanner.nextLine();
    System.out.println("Please write a text for the body: ");
    String text = scanner.nextLine();

    int titleLength = title.length();

    System.out.println();
    printLines(titleLength);
    System.out.println(title);
    printLines(titleLength);
    System.out.println();
    System.out.println(text);

    scanner.close();
  }

  public static void printLines(int number) {
    String lines = "=";
    System.out.println(lines.repeat(number));
  }  
}
