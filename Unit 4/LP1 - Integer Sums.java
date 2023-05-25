// U4LP1 - Integer Sums
// Main.java
// Yutong Han 2/28/2023

import java.util.*;

public class Main {
  public static void main(String[] args) {

    // Create scanner
    Scanner input = new Scanner(System.in);
    int count = 0;
    int sum = 0;
    int number;

    // Calculate sum after 5 numbers
    while (count < 5) {
      System.out.print("Enter a number: ");
      number = input.nextInt();

      // Calculate sum if enter 999
      if (number == 999) {
        break;
      }

      // Calculate sum
      sum += number;
      count++;
    }

    // Close scanner
    input.close();

    // Print sum
    System.out.println("The sum is: " + sum);
  }
}
