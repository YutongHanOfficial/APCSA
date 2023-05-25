// U3 - Multiplication Facts
// Main.java
// Yutong Han 12/6/2022

// import packages
import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    
    // Create a scanner to read user input
    Scanner scanner = new Scanner(System.in);

    // Welcome text
    System.out.println("Time to practice your multiplication!\n");

    // Create a random number generator
    Random random = new Random();

    // Create an array to store the problems and answers
    int[][] problems = new int[10][3];
    int[] answers = new int[10];

    // Create a variable to store the user's score
    int score = 0;

    // Generate 10 random multiplication problems
    for (int i = 0; i < 10; i++) {
      // Generate two random numbers from 1 to 15
      int num1 = random.nextInt(15) + 1;
      int num2 = random.nextInt(15) + 1;

      // Store the problem and the correct answer in the array
      problems[i][0] = num1;
      problems[i][1] = num2;
      problems[i][2] = num1 * num2;

      // Ask the user the multiplication problem
      System.out.print("What is " + num1 + " x " + num2 + " = ");
      int answer = scanner.nextInt();

      // Check if the user's answer is correct
      if (answer == problems[i][2]) {
        // Increase the user's score if they got the problem correct
        score++;
      }
    }

    // Print the user's score
    System.out.println("\nYou got " + score + " out of 10 correct.");

    // Check if the user got any problems wrong
    if (score < 10) {
      System.out.println("\nHere are the problems you got wrong. Solve them again to improve your score.");

      // Keep track of the user's new score
      int newScore = 0;

      // Ask the user to solve the problems again
      for (int i = 0; i < 10; i++) {
        if (answers[i] != problems[i][2]) {
          // Ask the user the multiplication problem
          System.out.print(problems[i][0] + " x " + problems[i][1] + " = ");
          int answer = scanner.nextInt();

          // Check if the user's answer is correct
          if (answer == problems[i][2]) {
            // Increase the user's new score if they got the problem correct
            newScore++;
          }
        }
      }

      // Print the user's new score
      System.out.println("\nYou got " + newScore + " out of " + 10 + " correct.");
      // System.out.println("\nYou got " + newScore + " out of " + (10 - score) + " correct.");
    }
    scanner.close();
  }
}





// OLD CODE

// // Print the user's score
//     System.out.println("You got " + score + " out of 10 correct.");

//     // Check if the user got any problems wrong
//     if (score < 10) {
//       System.out.println("Here are the problems you got wrong:");

//       // Print the problems that the user got wrong
//       for (int i = 0; i < 10; i++) {
//         if (problems[i][2] != problems[i][2]) {
//           System.out.println(problems[i][0] + " x " + problems[i][1] + " = " + problems[i][2]);
//         }
//       }

//       // Ask the user to solve the problems again
//       System.out.println("Solve these problems again to improve your score:");

//       // Keep track of the user's new score
//       int newScore = 0;

//       // Ask the user to solve the problems again
//       for (int i = 0; i < 10; i++) {
//         if (problems[i][2] != problems[i][2]) {
//           // Ask the user the multiplication problem
//           System.out.print(problems[i][0] + " x " + problems[i][1] + " = ");
//           int answer = scanner.nextInt();

//           // Check if the user's answer is correct
//           if (answer == problems[i][2]) {
//             // Increase the user's new score if they got the problem correct
//             newScore++;
//           }
//         }
//       }

//       // Print the user's new score
//       System.out.println("You got " + newScore + " out of " + (10 - score) + " correct.");
//     }
