// U4LP2 - Guessing Game
// Main.java
// Yutong Han 2/28/2023

import java.util.*;

public class Main {
  public static void main(String[] args) {

    // Create RNG
    Random random = new Random();
    int secretNumber = random.nextInt(101); // Generate random number
        
    // Create scanner
    Scanner input = new Scanner(System.in);
        
    // Initialize variables
    int guess = -1;
    int numGuesses = 0;
        
    // Play game
    while (guess != secretNumber) {
      // Prompt user for guess
      System.out.print("Guess a number between 0 and 100: ");
      guess = input.nextInt();
      numGuesses++;
          
      // Check if the guess is too high, too low, or correct
      if (guess > secretNumber) {
        System.out.println("Too high!");
      }
      else if (guess < secretNumber) {
        System.out.println("Too low!");
      } else {
        System.out.println("You got it!");
      }
    }
        
    // Print number of tries to guess right
    System.out.println("It took you " + numGuesses + " guesses.");
        
    // Close scanner
    input.close();
  }
}
