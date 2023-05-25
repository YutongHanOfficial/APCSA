// U4P2 - Rock, Paper, Scissors
// Main.java
// Yutong Han 1/27/2023

// Import everything in util
import java.util.*;

public class Main {
  public static void main(String[] args) {

    // Create scanner
    Scanner scan = new Scanner(System.in);

    // Create a random number generator
    Random random = new Random();

    // Lottery welcome
    System.out.println("Welcome to the lottery, where you probably will lose!\n");

    // Ask for rock, paper, or scissors
    System.out.print("Enter [1] for rock, [2] for paper, [3] for scissors: ");
    int number = scan.nextInt();

    // Make sure the number works
    if (number < 1 || number > 3) {
      System.out.print((char)27 + "[31m"); // Red
      System.out.println("Invalid input, please restart the program.");
      System.exit(0);
    }

    // Generate random number
    int generated = random.nextInt(3) + 1;

    // Computer play
    System.out.println("\nThe computer played: " + generated);

    // Check who won
    if (generated == 1 && number == 2) {
      System.out.println("You won!");
    } else
    if (generated == 1 && number == 3) {
      System.out.println("You lost!");
    } else
    if (generated == 2 && number == 1) {
      System.out.println("You lost!");
    } else
    if (generated == 2 && number == 3) {
      System.out.println("You won!");
    } else
    if (generated == 3 && number == 1) {
      System.out.println("You won!");
    } else
    if (generated == 3 && number == 2) {
      System.out.println("You lost!");
    } else
    if (generated == 1 && number == 1) {
      System.out.println("You drew!");
    } else
    if (generated == 2 && number == 2) {
      System.out.println("You drew!");
    } else
    if (generated == 3 && number == 3) {
      System.out.println("You drew!");
    }
    
    // Close the scanner
    scan.close();
  }
}
