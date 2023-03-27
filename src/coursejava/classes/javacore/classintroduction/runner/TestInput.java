package coursejava.classes.javacore.classintroduction.runner;

import java.util.Scanner;

public class TestInput {
  public static void main(String[] args) {
    Scanner io = new Scanner(System.in);
    System.out.print("How to name: ");
    String name = io.nextLine();

    System.out.println("Your name is ==> "+name);
  }
}
