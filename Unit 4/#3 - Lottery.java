// U4P3 - Lottery
// Main.java
// Yutong Han 1/24/2023

// Import everything in util
import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {

    // Create scanner
    Scanner scan = new Scanner(System.in);

    // Create a random number generator
    Random random = new Random();

    // Lottery welcome
    System.out.println("Welcome to the lottery, where you probably will lose!\n");

    // Ask for a two digit number
    System.out.print("Enter a two digit number: ");
    int number = scan.nextInt();

    // Make sure number is two digits
    if (number < 10 || number > 99) {
      System.out.print((char)27 + "[31m"); // Red
      System.out.println("Invalid input, please restart the program.");
      System.exit(0);
    }

    // Generate random number
    int generated = random.nextInt(89) + 10;


    // Lottery drew
    System.out.println("\nThe lottery drew: " + generated);

    if (number == generated) {
      System.out.println("You won $10,000!");
    } else
      if (number != generated) {
        System.out.println("You lost!");
      }
    
    // Close the scanner
    scan.close();
  }
}
