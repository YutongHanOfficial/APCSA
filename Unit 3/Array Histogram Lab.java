// U3 - Array Histogram Lab
// Main.java
// Yutong Han 12/5/2022

// import packages
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws FileNotFoundException {
    
    System.out.print((char)27 + "[4m"); // Adds underline
    System.out.print((char)27 + "[31m"); // Red text color
    System.out.println("Histogram of Scores");
    System.out.print((char)27 + "[24m"); // Removes underline
    
    int[] counts = new int[101]; // Gets the scores ranging from 0 to 100

    Scanner creativeNameForScanner = new Scanner(new File("testGrade.txt")); // Scans the testGrade.txt file

    while (creativeNameForScanner.hasNextInt()) { // Read testGrade.txt in counts array
      int score = creativeNameForScanner.nextInt();
      counts[score]++; // Counts the amount of scores
    }

    for (int i = 0; i < counts.length; i++) {
      if (counts[i] > 0) { // Stores the amount of students that scored i
        System.out.print((char)27 + "[36m"); // Cyan text color
        System.out.print(i + ": ");
        for (int j = 0; j < counts[i]; j++) {
          System.out.print((char)27 + "[92m"); // Green text color
          System.out.print("*"); // Prints a star for every score of the value
        } //for
        System.out.print((char)27 + "[33m"); // Yellow text color
        System.out.print(" " + counts[i] + " scores"); // Lists the number of scores for each value
        System.out.println(); // Line break
      } // if
    } // outer for

    
  } // main()
} // Main
