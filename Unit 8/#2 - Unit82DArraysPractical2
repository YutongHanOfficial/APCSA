// U8LP2 - Unit82DArraysPractical2
// Main.java
// Yutong Han 3/17/2023

public class Main {
  public static void main(String[] args) {
    // Create empty 10x10 2D array of integers
    int[][] array = new int[10][10];
    int total, biggestTotal = 0, rowNumber = 0, colNumber = 0, biggestColTotal = 0;

    // Fill the array with random values between 1 and 5 inclusive
    for (int row = 0; row < array.length; row++) {
      for (int col = 0; col < array[row].length; col++) {
        array[row][col] = (int) (Math.random() * 5) + 1;
      } // Close inner for loop
    } // Close outer for loop

    // Print the array
    for (int row = 0; row < array.length; row++) {
      for (int col = 0; col < array[row].length; col++) {
        System.out.print(array[row][col] + " ");
      } // Close inner for loop
      System.out.println();
    } // Close outer for loop

    // Determine which row has the biggest total
    for (int row = 0; row < array.length; row++) {
      total = 0;
      for (int col = 0; col < array[row].length; col++) {
        total += array[row][col];
      } // Close inner for loop
      if (total > biggestTotal) {
        rowNumber = row;
        biggestTotal = total;
      } // Close if statement
    } // Close outer for loop

    // Display which row has the biggest total
    System.out.println("Row " + rowNumber + " has the biggest total of " + biggestTotal);

    // Determine which column has the biggest total
    for (int col = 0; col < array[0].length; col++) {
      total = 0;
      for (int row = 0; row < array.length; row++) {
        total += array[row][col];
      } // Close inner for loop
      if (total > biggestColTotal) {
        colNumber = col;
        biggestColTotal = total;
      } // Close if statement
    } // Close outer for loop

    // Display which column has the biggest total 
    System.out.println("Column " + colNumber + " has the biggest total of " + biggestColTotal);
  } // Close main method
} // Close class Main
