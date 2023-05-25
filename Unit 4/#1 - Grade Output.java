// U4P1 - Grade Output
// Main.java
// Yutong Han 1/27/2023

import java.util.*;

public class Main {
  public static void main(String[] args) {
    // Create scanner
    Scanner scan = new Scanner(System.in);

    // Ask for integer grade
    System.out.print("Enter in your grade as an integer: ");
    int number = scan.nextInt();

    // Close the scanner
    scan.close();

    // Print grade as letter
    if (number >= 98) {
      System.out.println("A+");
    } else
    if (number >= 93) {
      System.out.println("A");
    } else
    if (number >= 90) {
      System.out.println("A-");
    } else
    if (number >= 88) {
      System.out.println("B+");
    } else
    if (number >= 83) {
      System.out.println("B");
    } else
    if (number >= 80) {
      System.out.println("B-");
    } else
    if (number >= 78) {
      System.out.println("C+");
    } else
    if (number >= 73) {
      System.out.println("C");
    } else
    if (number >= 70) {
      System.out.println("C-");
    }else
    if (number >= 68) {
      System.out.println("D+");
    } else
    if (number >= 63) {
      System.out.println("D");
    } else
    if (number >= 60) {
      System.out.println("D-");
    } else
    if (number >= 0) {
      System.out.println("E");
    }
  }
}
