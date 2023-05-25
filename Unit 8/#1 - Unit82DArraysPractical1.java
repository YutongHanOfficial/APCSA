// U8LP1 - Unit82DArraysPractical1
// Main.java
// Yutong Han 3/17/2023

public class Main {
  public static void main(String[] args) {
    // Create empty 10x10 2D array of integers
    int[][] array = new int[10][10];

    // Fill array with random values between 1 and 10 inclusive
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = (int) (Math.random() * 10 + 1);
      } // Close inner for loop
    } // Close outer for loop

    // Print out the array
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println(); // Print each row on a new line
    } // Close inner for loop
  } // Close main method
} // Close class Main
